const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entry_number`,
                label: `[${labelPrefix}entry_number]`,
                required: true,
                type: 'integer',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokemon_species`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entry_number': bundle.inputData?.[`${keyPrefix}entry_number`],
            'pokemon_species': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}pokemon_species`)),
        }
    },
}
