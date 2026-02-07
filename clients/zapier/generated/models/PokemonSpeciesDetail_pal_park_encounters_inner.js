const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}area`, isInput),
            {
                key: `${keyPrefix}base_score`,
                label: `[${labelPrefix}base_score]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}rate`,
                label: `[${labelPrefix}rate]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'area': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}area`)),
            'base_score': bundle.inputData?.[`${keyPrefix}base_score`],
            'rate': bundle.inputData?.[`${keyPrefix}rate`],
        }
    },
}
