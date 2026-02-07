const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}max_change`,
                label: `[${labelPrefix}max_change]`,
                required: true,
                type: 'integer',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokeathlon_stat`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'max_change': bundle.inputData?.[`${keyPrefix}max_change`],
            'pokeathlon_stat': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}pokeathlon_stat`)),
        }
    },
}
