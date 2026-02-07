const utils = require('../utils/utils');
const BerryDetail_flavors_inner_flavor = require('../models/BerryDetail_flavors_inner_flavor');

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
            ...BerryDetail_flavors_inner_flavor.fields(`${keyPrefix}flavor`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'potency': bundle.inputData?.[`${keyPrefix}potency`],
            'flavor': utils.removeIfEmpty(BerryDetail_flavors_inner_flavor.mapping(bundle, `${keyPrefix}flavor`)),
        }
    },
}
