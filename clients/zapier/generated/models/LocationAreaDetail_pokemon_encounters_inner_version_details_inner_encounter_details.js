const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}min_level`,
                label: `[${labelPrefix}min_level]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_level`,
                label: `[${labelPrefix}max_level]`,
                required: true,
                type: 'integer',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}condition_values`, isInput),
            {
                key: `${keyPrefix}chance`,
                label: `[${labelPrefix}chance]`,
                required: true,
                type: 'integer',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}method`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'min_level': bundle.inputData?.[`${keyPrefix}min_level`],
            'max_level': bundle.inputData?.[`${keyPrefix}max_level`],
            'condition_values': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}condition_values`)),
            'chance': bundle.inputData?.[`${keyPrefix}chance`],
            'method': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}method`)),
        }
    },
}
