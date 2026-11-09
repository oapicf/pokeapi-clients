const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}front_default`,
                label: `The URL of the default Pokémon Showdown front image, or null if unavailable. - [${labelPrefix}front_default]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_female`,
                label: `The URL of the female Pokémon Showdown front image, or null if unavailable. - [${labelPrefix}front_female]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_shiny`,
                label: `The URL of the shiny Pokémon Showdown front image, or null if unavailable. - [${labelPrefix}front_shiny]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_shiny_female`,
                label: `The URL of the shiny female Pokémon Showdown front image, or null if unavailable. - [${labelPrefix}front_shiny_female]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_default`,
                label: `The URL of the default Pokémon Showdown back image, or null if unavailable. - [${labelPrefix}back_default]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_female`,
                label: `The URL of the female Pokémon Showdown back image, or null if unavailable. - [${labelPrefix}back_female]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_shiny`,
                label: `The URL of the shiny Pokémon Showdown back image, or null if unavailable. - [${labelPrefix}back_shiny]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_shiny_female`,
                label: `The URL of the shiny female Pokémon Showdown back image, or null if unavailable. - [${labelPrefix}back_shiny_female]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'front_default': bundle.inputData?.[`${keyPrefix}front_default`],
            'front_female': bundle.inputData?.[`${keyPrefix}front_female`],
            'front_shiny': bundle.inputData?.[`${keyPrefix}front_shiny`],
            'front_shiny_female': bundle.inputData?.[`${keyPrefix}front_shiny_female`],
            'back_default': bundle.inputData?.[`${keyPrefix}back_default`],
            'back_female': bundle.inputData?.[`${keyPrefix}back_female`],
            'back_shiny': bundle.inputData?.[`${keyPrefix}back_shiny`],
            'back_shiny_female': bundle.inputData?.[`${keyPrefix}back_shiny_female`],
        }
    },
}
