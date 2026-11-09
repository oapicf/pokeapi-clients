const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');
const MoveDamageClassSummary = require('../models/MoveDamageClassSummary');
const MoveSummary = require('../models/MoveSummary');
const TypeGameIndex = require('../models/TypeGameIndex');
const TypeGameSprite = require('../models/TypeGameSprite');
const TypeName = require('../models/TypeName');
const TypePastRelationships = require('../models/TypePastRelationships');
const TypePokemon = require('../models/TypePokemon');
const TypeRelationships = require('../models/TypeRelationships');

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
            ...TypeRelationships.fields(`${keyPrefix}damage_relations`, isInput),
            {
                key: `${keyPrefix}past_damage_relations`,
                label: `[${labelPrefix}past_damage_relations]`,
                children: TypePastRelationships.fields(`${keyPrefix}past_damage_relations${!isInput ? '[]' : ''}`, isInput, true), 
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
                children: TypeName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon`,
                label: `[${labelPrefix}pokemon]`,
                children: TypePokemon.fields(`${keyPrefix}pokemon${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: MoveSummary.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}sprites`,
                label: `Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. - [${labelPrefix}sprites]`,
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
            'damage_relations': utils.removeIfEmpty(TypeRelationships.mapping(bundle, `${keyPrefix}damage_relations`)),
            'past_damage_relations': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_damage_relations`], `${keyPrefix}past_damage_relations`, TypePastRelationships),
            'game_indices': utils.childMapping(bundle.inputData?.[`${keyPrefix}game_indices`], `${keyPrefix}game_indices`, TypeGameIndex),
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'move_damage_class': utils.removeIfEmpty(MoveDamageClassSummary.mapping(bundle, `${keyPrefix}move_damage_class`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, TypeName),
            'pokemon': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon`], `${keyPrefix}pokemon`, TypePokemon),
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, MoveSummary),
            'sprites': bundle.inputData?.[`${keyPrefix}sprites`],
        }
    },
}
