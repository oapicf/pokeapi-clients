const utils = require('../utils/utils');
const LanguageSummary = require('../models/LanguageSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}count`,
                label: `[${labelPrefix}count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}next`,
                label: `[${labelPrefix}next]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}previous`,
                label: `[${labelPrefix}previous]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}results`,
                label: `[${labelPrefix}results]`,
                children: LanguageSummary.fields(`${keyPrefix}results${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'next': bundle.inputData?.[`${keyPrefix}next`],
            'previous': bundle.inputData?.[`${keyPrefix}previous`],
            'results': utils.childMapping(bundle.inputData?.[`${keyPrefix}results`], `${keyPrefix}results`, LanguageSummary),
        }
    },
}
