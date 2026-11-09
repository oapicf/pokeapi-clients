const utils = require('../utils/utils');
const MoveSummary = require('../models/MoveSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}use_before`,
                label: `[${labelPrefix}use_before]`,
                children: MoveSummary.fields(`${keyPrefix}use_before${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}use_after`,
                label: `[${labelPrefix}use_after]`,
                children: MoveSummary.fields(`${keyPrefix}use_after${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'use_before': utils.childMapping(bundle.inputData?.[`${keyPrefix}use_before`], `${keyPrefix}use_before`, MoveSummary),
            'use_after': utils.childMapping(bundle.inputData?.[`${keyPrefix}use_after`], `${keyPrefix}use_after`, MoveSummary),
        }
    },
}
