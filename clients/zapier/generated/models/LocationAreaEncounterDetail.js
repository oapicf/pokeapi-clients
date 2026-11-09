const utils = require('../utils/utils');
const EncounterConditionValueSummary = require('../models/EncounterConditionValueSummary');
const EncounterMethodSummary = require('../models/EncounterMethodSummary');
const EncounterPokemonDetail = require('../models/EncounterPokemonDetail');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}min_level`,
                label: `The lowest level the Pokémon could be encountered at. - [${labelPrefix}min_level]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_level`,
                label: `The highest level the Pokémon could be encountered at. - [${labelPrefix}max_level]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}chance`,
                label: `Percent chance that this encounter will occur. - [${labelPrefix}chance]`,
                type: 'integer',
            },
            ...EncounterMethodSummary.fields(`${keyPrefix}method`, isInput),
            {
                key: `${keyPrefix}condition_values`,
                label: `[${labelPrefix}condition_values]`,
                children: EncounterConditionValueSummary.fields(`${keyPrefix}condition_values${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...EncounterPokemonDetail.fields(`${keyPrefix}pokemon_details`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'min_level': bundle.inputData?.[`${keyPrefix}min_level`],
            'max_level': bundle.inputData?.[`${keyPrefix}max_level`],
            'chance': bundle.inputData?.[`${keyPrefix}chance`],
            'method': utils.removeIfEmpty(EncounterMethodSummary.mapping(bundle, `${keyPrefix}method`)),
            'condition_values': utils.childMapping(bundle.inputData?.[`${keyPrefix}condition_values`], `${keyPrefix}condition_values`, EncounterConditionValueSummary),
            'pokemon_details': utils.removeIfEmpty(EncounterPokemonDetail.mapping(bundle, `${keyPrefix}pokemon_details`)),
        }
    },
}
