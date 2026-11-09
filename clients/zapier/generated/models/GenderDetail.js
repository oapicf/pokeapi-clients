const utils = require('../utils/utils');
const GenderPokemonSpecies = require('../models/GenderPokemonSpecies');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

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
                key: `${keyPrefix}pokemon_species_details`,
                label: `[${labelPrefix}pokemon_species_details]`,
                children: GenderPokemonSpecies.fields(`${keyPrefix}pokemon_species_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}required_for_evolution`,
                label: `[${labelPrefix}required_for_evolution]`,
                children: PokemonSpeciesSummary.fields(`${keyPrefix}required_for_evolution${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'pokemon_species_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_species_details`], `${keyPrefix}pokemon_species_details`, GenderPokemonSpecies),
            'required_for_evolution': utils.childMapping(bundle.inputData?.[`${keyPrefix}required_for_evolution`], `${keyPrefix}required_for_evolution`, PokemonSpeciesSummary),
        }
    },
}
