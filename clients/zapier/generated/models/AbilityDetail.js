const utils = require('../utils/utils');
const AbilityChange = require('../models/AbilityChange');
const AbilityDetail_pokemon_inner = require('../models/AbilityDetail_pokemon_inner');
const AbilityEffectText = require('../models/AbilityEffectText');
const AbilityFlavorText = require('../models/AbilityFlavorText');
const AbilityName = require('../models/AbilityName');
const GenerationSummary = require('../models/GenerationSummary');

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
                key: `${keyPrefix}is_main_series`,
                label: `[${labelPrefix}is_main_series]`,
                type: 'boolean',
            },
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: AbilityName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}effect_entries`,
                label: `[${labelPrefix}effect_entries]`,
                children: AbilityEffectText.fields(`${keyPrefix}effect_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}effect_changes`,
                label: `[${labelPrefix}effect_changes]`,
                children: AbilityChange.fields(`${keyPrefix}effect_changes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: AbilityFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon`,
                label: `[${labelPrefix}pokemon]`,
                children: AbilityDetail_pokemon_inner.fields(`${keyPrefix}pokemon${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'is_main_series': bundle.inputData?.[`${keyPrefix}is_main_series`],
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, AbilityName),
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, AbilityEffectText),
            'effect_changes': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_changes`], `${keyPrefix}effect_changes`, AbilityChange),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, AbilityFlavorText),
            'pokemon': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon`], `${keyPrefix}pokemon`, AbilityDetail_pokemon_inner),
        }
    },
}
