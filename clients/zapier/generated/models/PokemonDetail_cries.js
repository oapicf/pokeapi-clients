const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}latest`,
                label: `[${labelPrefix}latest]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}legacy`,
                label: `[${labelPrefix}legacy]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'latest': bundle.inputData?.[`${keyPrefix}latest`],
            'legacy': bundle.inputData?.[`${keyPrefix}legacy`],
        }
    },
}
