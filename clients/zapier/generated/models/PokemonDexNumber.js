const utils = require('../utils/utils');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entry_number`,
                label: `The index of this Pokémon species entry within the Pokédex. - [${labelPrefix}entry_number]`,
                required: true,
                type: 'integer',
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}pokemon_species`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entry_number': bundle.inputData?.[`${keyPrefix}entry_number`],
            'pokemon_species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}pokemon_species`)),
        }
    },
}
