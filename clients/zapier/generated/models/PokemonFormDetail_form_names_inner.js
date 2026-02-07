const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}language`, isInput),
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'language': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}language`)),
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
