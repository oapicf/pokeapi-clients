const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name_icon`,
                label: `The URL of the icon displaying the type name in this game, or null if unavailable. - [${labelPrefix}name_icon]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}symbol_icon`,
                label: `The URL of the type symbol icon in this game, or null if unavailable. - [${labelPrefix}symbol_icon]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name_icon': bundle.inputData?.[`${keyPrefix}name_icon`],
            'symbol_icon': bundle.inputData?.[`${keyPrefix}symbol_icon`],
        }
    },
}
