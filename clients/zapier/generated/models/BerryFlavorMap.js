const utils = require('../utils/utils');
const BerryFlavorSummary = require('../models/BerryFlavorSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}potency`,
                label: `How powerful the referenced flavor is for this berry. - [${labelPrefix}potency]`,
                required: true,
                type: 'integer',
            },
            ...BerryFlavorSummary.fields(`${keyPrefix}flavor`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'potency': bundle.inputData?.[`${keyPrefix}potency`],
            'flavor': utils.removeIfEmpty(BerryFlavorSummary.mapping(bundle, `${keyPrefix}flavor`)),
        }
    },
}
