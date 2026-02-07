const utils = require('../utils/utils');
const AbilityName = require('../models/AbilityName');
const GenerationSummary = require('../models/GenerationSummary');
const MoveDamageClassSummary = require('../models/MoveDamageClassSummary');
const MoveSummary = require('../models/MoveSummary');
const TypeDetail_damage_relations = require('../models/TypeDetail_damage_relations');
const TypeDetail_past_damage_relations_inner = require('../models/TypeDetail_past_damage_relations_inner');
const TypeDetail_pokemon_inner = require('../models/TypeDetail_pokemon_inner');
const TypeDetail_sprites_value_value = require('../models/TypeDetail_sprites_value_value');
const TypeGameIndex = require('../models/TypeGameIndex');

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
            ...TypeDetail_damage_relations.fields(`${keyPrefix}damage_relations`, isInput),
            {
                key: `${keyPrefix}past_damage_relations`,
                label: `[${labelPrefix}past_damage_relations]`,
                children: TypeDetail_past_damage_relations_inner.fields(`${keyPrefix}past_damage_relations${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}game_indices`,
                label: `[${labelPrefix}game_indices]`,
                children: TypeGameIndex.fields(`${keyPrefix}game_indices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            ...MoveDamageClassSummary.fields(`${keyPrefix}move_damage_class`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: AbilityName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon`,
                label: `[${labelPrefix}pokemon]`,
                children: TypeDetail_pokemon_inner.fields(`${keyPrefix}pokemon${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: MoveSummary.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}sprites`,
                label: `[${labelPrefix}sprites]`,
                required: true,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'damage_relations': utils.removeIfEmpty(TypeDetail_damage_relations.mapping(bundle, `${keyPrefix}damage_relations`)),
            'past_damage_relations': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_damage_relations`], `${keyPrefix}past_damage_relations`, TypeDetail_past_damage_relations_inner),
            'game_indices': utils.childMapping(bundle.inputData?.[`${keyPrefix}game_indices`], `${keyPrefix}game_indices`, TypeGameIndex),
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'move_damage_class': utils.removeIfEmpty(MoveDamageClassSummary.mapping(bundle, `${keyPrefix}move_damage_class`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, AbilityName),
            'pokemon': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon`], `${keyPrefix}pokemon`, TypeDetail_pokemon_inner),
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, MoveSummary),
            'sprites': bundle.inputData?.[`${keyPrefix}sprites`],
        }
    },
}
