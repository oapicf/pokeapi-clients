const utils = require('../utils/utils');
const NatureSummary = require('../models/NatureSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}increase`,
                label: `[${labelPrefix}increase]`,
                children: NatureSummary.fields(`${keyPrefix}increase${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}decrease`,
                label: `[${labelPrefix}decrease]`,
                children: NatureSummary.fields(`${keyPrefix}decrease${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'increase': utils.childMapping(bundle.inputData?.[`${keyPrefix}increase`], `${keyPrefix}increase`, NatureSummary),
            'decrease': utils.childMapping(bundle.inputData?.[`${keyPrefix}decrease`], `${keyPrefix}decrease`, NatureSummary),
        }
    },
}
