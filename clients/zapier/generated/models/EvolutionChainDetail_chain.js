const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const AnyType = require('../models/AnyType');
const EvolutionChainDetail_chain_evolves_to_inner = require('../models/EvolutionChainDetail_chain_evolves_to_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}evolution_details`,
                label: `[${labelPrefix}evolution_details]`,
                children: .fields(`${keyPrefix}evolution_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}evolves_to`,
                label: `[${labelPrefix}evolves_to]`,
                children: EvolutionChainDetail_chain_evolves_to_inner.fields(`${keyPrefix}evolves_to${!isInput ? '[]' : ''}`, isInput, true), 
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
            'evolution_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}evolution_details`], `${keyPrefix}evolution_details`, AnyType),
            'evolves_to': utils.childMapping(bundle.inputData?.[`${keyPrefix}evolves_to`], `${keyPrefix}evolves_to`, EvolutionChainDetail_chain_evolves_to_inner),
            'is_baby': bundle.inputData?.[`${keyPrefix}is_baby`],
            'species': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}species`)),
        }
    },
}
