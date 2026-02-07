const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}machine`,
                label: `[${labelPrefix}machine]`,
                required: true,
                type: 'string',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}version_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'machine': bundle.inputData?.[`${keyPrefix}machine`],
            'version_group': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}version_group`)),
        }
    },
}
