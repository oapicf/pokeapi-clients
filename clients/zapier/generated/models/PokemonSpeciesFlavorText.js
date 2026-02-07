const utils = require('../utils/utils');
const LanguageSummary = require('../models/LanguageSummary');
const VersionSummary = require('../models/VersionSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}flavor_text`,
                label: `[${labelPrefix}flavor_text]`,
                required: true,
                type: 'string',
            },
            ...LanguageSummary.fields(`${keyPrefix}language`, isInput),
            ...VersionSummary.fields(`${keyPrefix}version`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'flavor_text': bundle.inputData?.[`${keyPrefix}flavor_text`],
            'language': utils.removeIfEmpty(LanguageSummary.mapping(bundle, `${keyPrefix}language`)),
            'version': utils.removeIfEmpty(VersionSummary.mapping(bundle, `${keyPrefix}version`)),
        }
    },
}
