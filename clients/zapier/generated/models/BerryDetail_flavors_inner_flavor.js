const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The name of the flavor - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}url`,
                label: `The URL to get more information about the flavor - [${labelPrefix}url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
        }
    },
}
