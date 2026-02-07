const utils = require('../utils/utils');
const LanguageSummary = require('../models/LanguageSummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}text`,
                label: `[${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
            ...LanguageSummary.fields(`${keyPrefix}language`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
            'language': utils.removeIfEmpty(LanguageSummary.mapping(bundle, `${keyPrefix}language`)),
        }
    },
}
