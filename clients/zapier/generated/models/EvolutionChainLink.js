const utils = require('../utils/utils');
const PokemonEvolution = require('../models/PokemonEvolution');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_baby`,
                label: `Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. - [${labelPrefix}is_baby]`,
                required: true,
                type: 'boolean',
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}species`, isInput),
            {
                key: `${keyPrefix}evolution_details`,
                label: `[${labelPrefix}evolution_details]`,
                children: PokemonEvolution.fields(`${keyPrefix}evolution_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}evolves_to`,
                label: `[${labelPrefix}evolves_to]`,
                children: EvolutionChainLink.fields(`${keyPrefix}evolves_to${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_baby': bundle.inputData?.[`${keyPrefix}is_baby`],
            'species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}species`)),
            'evolution_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}evolution_details`], `${keyPrefix}evolution_details`, PokemonEvolution),
            'evolves_to': utils.childMapping(bundle.inputData?.[`${keyPrefix}evolves_to`], `${keyPrefix}evolves_to`, EvolutionChainLink),
        }
    },
}
