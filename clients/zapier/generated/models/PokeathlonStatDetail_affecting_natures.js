const utils = require('../utils/utils');
const PokeathlonStatDetail_affecting_natures_decrease_inner = require('../models/PokeathlonStatDetail_affecting_natures_decrease_inner');
const PokeathlonStatDetail_affecting_natures_increase_inner = require('../models/PokeathlonStatDetail_affecting_natures_increase_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}decrease`,
                label: `[${labelPrefix}decrease]`,
                children: PokeathlonStatDetail_affecting_natures_decrease_inner.fields(`${keyPrefix}decrease${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}increase`,
                label: `[${labelPrefix}increase]`,
                children: PokeathlonStatDetail_affecting_natures_increase_inner.fields(`${keyPrefix}increase${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'decrease': utils.childMapping(bundle.inputData?.[`${keyPrefix}decrease`], `${keyPrefix}decrease`, PokeathlonStatDetail_affecting_natures_decrease_inner),
            'increase': utils.childMapping(bundle.inputData?.[`${keyPrefix}increase`], `${keyPrefix}increase`, PokeathlonStatDetail_affecting_natures_increase_inner),
        }
    },
}
