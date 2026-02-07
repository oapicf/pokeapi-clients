const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_default`,
                label: `[${labelPrefix}is_default]`,
                required: true,
                type: 'boolean',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokemon`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_default': bundle.inputData?.[`${keyPrefix}is_default`],
            'pokemon': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}pokemon`)),
        }
    },
}
