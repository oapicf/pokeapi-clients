const utils = require('../utils/utils');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}base_score`,
                label: `The base score given to the player when this Pokémon is caught during a pal park run. - [${labelPrefix}base_score]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}rate`,
                label: `The base rate for encountering this Pokémon in this pal park area. - [${labelPrefix}rate]`,
                required: true,
                type: 'integer',
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}pokemon_species`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'base_score': bundle.inputData?.[`${keyPrefix}base_score`],
            'rate': bundle.inputData?.[`${keyPrefix}rate`],
            'pokemon_species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}pokemon_species`)),
        }
    },
}
