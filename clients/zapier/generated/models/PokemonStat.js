const utils = require('../utils/utils');
const StatSummary = require('../models/StatSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}base_stat`,
                label: `[${labelPrefix}base_stat]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}effort`,
                label: `[${labelPrefix}effort]`,
                required: true,
                type: 'integer',
            },
            ...StatSummary.fields(`${keyPrefix}stat`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'base_stat': bundle.inputData?.[`${keyPrefix}base_stat`],
            'effort': bundle.inputData?.[`${keyPrefix}effort`],
            'stat': utils.removeIfEmpty(StatSummary.mapping(bundle, `${keyPrefix}stat`)),
        }
    },
}
