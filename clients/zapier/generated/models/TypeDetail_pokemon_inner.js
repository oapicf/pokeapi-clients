const utils = require('../utils/utils');
const TypeDetail_pokemon_inner_pokemon = require('../models/TypeDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}slot`,
                label: `[${labelPrefix}slot]`,
                type: 'integer',
            },
            ...TypeDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokemon`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'slot': bundle.inputData?.[`${keyPrefix}slot`],
            'pokemon': utils.removeIfEmpty(TypeDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}pokemon`)),
        }
    },
}
