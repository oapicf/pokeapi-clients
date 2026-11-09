const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}front_default`,
                label: `The URL of the default front official artwork, or null if unavailable. - [${labelPrefix}front_default]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_shiny`,
                label: `The URL of the shiny front official artwork, or null if unavailable. - [${labelPrefix}front_shiny]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}versions`,
                label: `Additional official artwork grouped by version. Available keys vary by resource. - [${labelPrefix}versions]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'front_default': bundle.inputData?.[`${keyPrefix}front_default`],
            'front_shiny': bundle.inputData?.[`${keyPrefix}front_shiny`],
            'versions': bundle.inputData?.[`${keyPrefix}versions`],
        }
    },
}
