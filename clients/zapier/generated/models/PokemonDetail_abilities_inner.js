const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}ability`, isInput),
            {
                key: `${keyPrefix}is_hidden`,
                label: `[${labelPrefix}is_hidden]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}slot`,
                label: `[${labelPrefix}slot]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ability': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}ability`)),
            'is_hidden': bundle.inputData?.[`${keyPrefix}is_hidden`],
            'slot': bundle.inputData?.[`${keyPrefix}slot`],
        }
    },
}
