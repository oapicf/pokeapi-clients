const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}front_default`,
                label: `The URL of the default Pokémon Dream World front image, or null if unavailable. - [${labelPrefix}front_default]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_female`,
                label: `The URL of the female Pokémon Dream World front image, or null if unavailable. - [${labelPrefix}front_female]`,
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
        }
    },
}
