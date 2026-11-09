const utils = require('../utils/utils');
const CharacteristicSummary = require('../models/CharacteristicSummary');
const ItemSummary = require('../models/ItemSummary');
const MoveDamageClassSummary = require('../models/MoveDamageClassSummary');
const StatAffectingMoves = require('../models/StatAffectingMoves');
const StatAffectingNatures = require('../models/StatAffectingNatures');
const StatName = require('../models/StatName');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier for this resource. - [${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name for this resource. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}game_index`,
                label: `ID the games use for this stat. - [${labelPrefix}game_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_battle_only`,
                label: `Whether this stat only exists within a battle. - [${labelPrefix}is_battle_only]`,
                type: 'boolean',
            },
            ...StatAffectingMoves.fields(`${keyPrefix}affecting_moves`, isInput),
            ...StatAffectingNatures.fields(`${keyPrefix}affecting_natures`, isInput),
            {
                key: `${keyPrefix}affecting_items`,
                label: `[${labelPrefix}affecting_items]`,
                children: ItemSummary.fields(`${keyPrefix}affecting_items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}characteristics`,
                label: `[${labelPrefix}characteristics]`,
                children: CharacteristicSummary.fields(`${keyPrefix}characteristics${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...MoveDamageClassSummary.fields(`${keyPrefix}move_damage_class`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: StatName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'game_index': bundle.inputData?.[`${keyPrefix}game_index`],
            'is_battle_only': bundle.inputData?.[`${keyPrefix}is_battle_only`],
            'affecting_moves': utils.removeIfEmpty(StatAffectingMoves.mapping(bundle, `${keyPrefix}affecting_moves`)),
            'affecting_natures': utils.removeIfEmpty(StatAffectingNatures.mapping(bundle, `${keyPrefix}affecting_natures`)),
            'affecting_items': utils.childMapping(bundle.inputData?.[`${keyPrefix}affecting_items`], `${keyPrefix}affecting_items`, ItemSummary),
            'characteristics': utils.childMapping(bundle.inputData?.[`${keyPrefix}characteristics`], `${keyPrefix}characteristics`, CharacteristicSummary),
            'move_damage_class': utils.removeIfEmpty(MoveDamageClassSummary.mapping(bundle, `${keyPrefix}move_damage_class`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, StatName),
        }
    },
}
