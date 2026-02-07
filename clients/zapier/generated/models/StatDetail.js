const utils = require('../utils/utils');
const CharacteristicSummary = require('../models/CharacteristicSummary');
const MoveDamageClassSummary = require('../models/MoveDamageClassSummary');
const StatDetail_affecting_moves = require('../models/StatDetail_affecting_moves');
const StatDetail_affecting_natures = require('../models/StatDetail_affecting_natures');
const StatName = require('../models/StatName');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}game_index`,
                label: `[${labelPrefix}game_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_battle_only`,
                label: `[${labelPrefix}is_battle_only]`,
                type: 'boolean',
            },
            ...StatDetail_affecting_moves.fields(`${keyPrefix}affecting_moves`, isInput),
            ...StatDetail_affecting_natures.fields(`${keyPrefix}affecting_natures`, isInput),
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
            'affecting_moves': utils.removeIfEmpty(StatDetail_affecting_moves.mapping(bundle, `${keyPrefix}affecting_moves`)),
            'affecting_natures': utils.removeIfEmpty(StatDetail_affecting_natures.mapping(bundle, `${keyPrefix}affecting_natures`)),
            'characteristics': utils.childMapping(bundle.inputData?.[`${keyPrefix}characteristics`], `${keyPrefix}characteristics`, CharacteristicSummary),
            'move_damage_class': utils.removeIfEmpty(MoveDamageClassSummary.mapping(bundle, `${keyPrefix}move_damage_class`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, StatName),
        }
    },
}
