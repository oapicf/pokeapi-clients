const utils = require('../utils/utils');
const VersionSummary = require('../models/VersionSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rate`,
                label: `The chance of an encounter to occur. - [${labelPrefix}rate]`,
                required: true,
                type: 'integer',
            },
            ...VersionSummary.fields(`${keyPrefix}version`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rate': bundle.inputData?.[`${keyPrefix}rate`],
            'version': utils.removeIfEmpty(VersionSummary.mapping(bundle, `${keyPrefix}version`)),
        }
    },
}
