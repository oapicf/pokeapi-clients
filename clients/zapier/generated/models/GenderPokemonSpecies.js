const utils = require('../utils/utils');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rate`,
                label: `The chance of this Pokémon being female, in eighths; or -1 for genderless. - [${labelPrefix}rate]`,
                required: true,
                type: 'integer',
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}pokemon_species`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rate': bundle.inputData?.[`${keyPrefix}rate`],
            'pokemon_species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}pokemon_species`)),
        }
    },
}
