const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}awesome_name`,
                label: `[${labelPrefix}awesome_name]`,
                required: true,
                type: 'string',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}language`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'awesome_name': bundle.inputData?.[`${keyPrefix}awesome_name`],
            'language': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}language`)),
        }
    },
}
