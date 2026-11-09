const utils = require('../utils/utils');
const BerrySummary = require('../models/BerrySummary');

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
            ...BerrySummary.fields(`${keyPrefix}berry`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'potency': bundle.inputData?.[`${keyPrefix}potency`],
            'berry': utils.removeIfEmpty(BerrySummary.mapping(bundle, `${keyPrefix}berry`)),
        }
    },
}
