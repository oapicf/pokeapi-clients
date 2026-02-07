const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner = require('../models/EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}evolution_details`,
                label: `[${labelPrefix}evolution_details]`,
                children: EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.fields(`${keyPrefix}evolution_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}is_baby`,
                label: `[${labelPrefix}is_baby]`,
                required: true,
                type: 'boolean',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}species`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'evolution_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}evolution_details`], `${keyPrefix}evolution_details`, EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner),
            'is_baby': bundle.inputData?.[`${keyPrefix}is_baby`],
            'species': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}species`)),
        }
    },
}
