const utils = require('../utils/utils');
const PokeathlonStatDetail_affecting_natures = require('../models/PokeathlonStatDetail_affecting_natures');
const PokeathlonStatName = require('../models/PokeathlonStatName');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...PokeathlonStatDetail_affecting_natures.fields(`${keyPrefix}affecting_natures`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokeathlonStatName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'affecting_natures': utils.removeIfEmpty(PokeathlonStatDetail_affecting_natures.mapping(bundle, `${keyPrefix}affecting_natures`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokeathlonStatName),
        }
    },
}
