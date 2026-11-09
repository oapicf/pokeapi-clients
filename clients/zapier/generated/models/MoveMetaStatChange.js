const utils = require('../utils/utils');
const StatSummary = require('../models/StatSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}change`,
                label: `The amount of change. - [${labelPrefix}change]`,
                required: true,
                type: 'integer',
            },
            ...StatSummary.fields(`${keyPrefix}stat`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'change': bundle.inputData?.[`${keyPrefix}change`],
            'stat': utils.removeIfEmpty(StatSummary.mapping(bundle, `${keyPrefix}stat`)),
        }
    },
}
