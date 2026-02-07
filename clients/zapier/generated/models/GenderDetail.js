const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const GenderDetail_pokemon_species_details_inner = require('../models/GenderDetail_pokemon_species_details_inner');

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
                key: `${keyPrefix}pokemon_species_details`,
                label: `[${labelPrefix}pokemon_species_details]`,
                children: GenderDetail_pokemon_species_details_inner.fields(`${keyPrefix}pokemon_species_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}required_for_evolution`,
                label: `[${labelPrefix}required_for_evolution]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}required_for_evolution${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'pokemon_species_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_species_details`], `${keyPrefix}pokemon_species_details`, GenderDetail_pokemon_species_details_inner),
            'required_for_evolution': utils.childMapping(bundle.inputData?.[`${keyPrefix}required_for_evolution`], `${keyPrefix}required_for_evolution`, AbilityDetail_pokemon_inner_pokemon),
        }
    },
}
