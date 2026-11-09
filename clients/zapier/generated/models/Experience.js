const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}level`,
                label: `The level gained. - [${labelPrefix}level]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}experience`,
                label: `The amount of experience required to reach the referenced level. - [${labelPrefix}experience]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'level': bundle.inputData?.[`${keyPrefix}level`],
            'experience': bundle.inputData?.[`${keyPrefix}experience`],
        }
    },
}
