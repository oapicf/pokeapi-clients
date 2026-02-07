const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rarity`,
                label: `[${labelPrefix}rarity]`,
                required: true,
                type: 'integer',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}version`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rarity': bundle.inputData?.[`${keyPrefix}rarity`],
            'version': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}version`)),
        }
    },
}
