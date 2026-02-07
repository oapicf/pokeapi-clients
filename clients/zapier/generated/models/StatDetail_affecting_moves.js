const utils = require('../utils/utils');
const StatDetail_affecting_moves_increase_inner = require('../models/StatDetail_affecting_moves_increase_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}increase`,
                label: `[${labelPrefix}increase]`,
                children: StatDetail_affecting_moves_increase_inner.fields(`${keyPrefix}increase${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}decrease`,
                label: `[${labelPrefix}decrease]`,
                children: StatDetail_affecting_moves_increase_inner.fields(`${keyPrefix}decrease${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'increase': utils.childMapping(bundle.inputData?.[`${keyPrefix}increase`], `${keyPrefix}increase`, StatDetail_affecting_moves_increase_inner),
            'decrease': utils.childMapping(bundle.inputData?.[`${keyPrefix}decrease`], `${keyPrefix}decrease`, StatDetail_affecting_moves_increase_inner),
        }
    },
}
