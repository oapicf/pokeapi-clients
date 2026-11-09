const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}deploy_date`,
                label: `The deployment time as a Unix timestamp string. - [${labelPrefix}deploy_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}hash`,
                label: `The source commit hash used for this deployment. - [${labelPrefix}hash]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}tag`,
                label: `The deployment tag, or null if the deployment has no tag. - [${labelPrefix}tag]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'deploy_date': bundle.inputData?.[`${keyPrefix}deploy_date`],
            'hash': bundle.inputData?.[`${keyPrefix}hash`],
            'tag': bundle.inputData?.[`${keyPrefix}tag`],
        }
    },
}
