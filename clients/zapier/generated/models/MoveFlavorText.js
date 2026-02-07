const utils = require('../utils/utils');
const LanguageSummary = require('../models/LanguageSummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

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
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'flavor_text': bundle.inputData?.[`${keyPrefix}flavor_text`],
            'language': utils.removeIfEmpty(LanguageSummary.mapping(bundle, `${keyPrefix}language`)),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
        }
    },
}
