const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}min_perfect_ivs`,
                label: `The minimum number of perfect IVs, or null if unspecified. - [${labelPrefix}min_perfect_ivs]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}always_shiny`,
                label: `Whether the encountered Pokémon is always shiny. - [${labelPrefix}always_shiny]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}never_shiny`,
                label: `Whether the encountered Pokémon can never be shiny. - [${labelPrefix}never_shiny]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_alpha`,
                label: `Whether the encountered Pokémon is an alpha Pokémon. - [${labelPrefix}is_alpha]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'min_perfect_ivs': bundle.inputData?.[`${keyPrefix}min_perfect_ivs`],
            'always_shiny': bundle.inputData?.[`${keyPrefix}always_shiny`],
            'never_shiny': bundle.inputData?.[`${keyPrefix}never_shiny`],
            'is_alpha': bundle.inputData?.[`${keyPrefix}is_alpha`],
        }
    },
}
