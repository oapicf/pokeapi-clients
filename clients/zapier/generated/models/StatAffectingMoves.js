const utils = require('../utils/utils');
const MoveStatChange = require('../models/MoveStatChange');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}increase`,
                label: `[${labelPrefix}increase]`,
                children: MoveStatChange.fields(`${keyPrefix}increase${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}decrease`,
                label: `[${labelPrefix}decrease]`,
                children: MoveStatChange.fields(`${keyPrefix}decrease${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'increase': utils.childMapping(bundle.inputData?.[`${keyPrefix}increase`], `${keyPrefix}increase`, MoveStatChange),
            'decrease': utils.childMapping(bundle.inputData?.[`${keyPrefix}decrease`], `${keyPrefix}decrease`, MoveStatChange),
        }
    },
}
