const utils = require('../utils/utils');
const PokeathlonStatAffectingNature = require('../models/PokeathlonStatAffectingNature');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}increase`,
                label: `[${labelPrefix}increase]`,
                children: PokeathlonStatAffectingNature.fields(`${keyPrefix}increase${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}decrease`,
                label: `[${labelPrefix}decrease]`,
                children: PokeathlonStatAffectingNature.fields(`${keyPrefix}decrease${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'increase': utils.childMapping(bundle.inputData?.[`${keyPrefix}increase`], `${keyPrefix}increase`, PokeathlonStatAffectingNature),
            'decrease': utils.childMapping(bundle.inputData?.[`${keyPrefix}decrease`], `${keyPrefix}decrease`, PokeathlonStatAffectingNature),
        }
    },
}
