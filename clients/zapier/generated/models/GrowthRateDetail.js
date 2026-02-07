const utils = require('../utils/utils');
const Experience = require('../models/Experience');
const GrowthRateDescription = require('../models/GrowthRateDescription');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

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
                key: `${keyPrefix}formula`,
                label: `[${labelPrefix}formula]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}descriptions`,
                label: `[${labelPrefix}descriptions]`,
                children: GrowthRateDescription.fields(`${keyPrefix}descriptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}levels`,
                label: `[${labelPrefix}levels]`,
                children: Experience.fields(`${keyPrefix}levels${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon_species`,
                label: `[${labelPrefix}pokemon_species]`,
                children: PokemonSpeciesSummary.fields(`${keyPrefix}pokemon_species${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'formula': bundle.inputData?.[`${keyPrefix}formula`],
            'descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}descriptions`], `${keyPrefix}descriptions`, GrowthRateDescription),
            'levels': utils.childMapping(bundle.inputData?.[`${keyPrefix}levels`], `${keyPrefix}levels`, Experience),
            'pokemon_species': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_species`], `${keyPrefix}pokemon_species`, PokemonSpeciesSummary),
        }
    },
}
