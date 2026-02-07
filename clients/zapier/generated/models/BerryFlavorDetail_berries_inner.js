const utils = require('../utils/utils');
const BerryFlavorDetail_berries_inner_berry = require('../models/BerryFlavorDetail_berries_inner_berry');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}potency`,
                label: `[${labelPrefix}potency]`,
                required: true,
                type: 'integer',
            },
            ...BerryFlavorDetail_berries_inner_berry.fields(`${keyPrefix}berry`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'potency': bundle.inputData?.[`${keyPrefix}potency`],
            'berry': utils.removeIfEmpty(BerryFlavorDetail_berries_inner_berry.mapping(bundle, `${keyPrefix}berry`)),
        }
    },
}
