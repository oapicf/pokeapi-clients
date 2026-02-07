const utils = require('../utils/utils');
const LanguageSummary = require('../models/LanguageSummary');

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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'flavor_text': bundle.inputData?.[`${keyPrefix}flavor_text`],
            'language': utils.removeIfEmpty(LanguageSummary.mapping(bundle, `${keyPrefix}language`)),
        }
    },
}
