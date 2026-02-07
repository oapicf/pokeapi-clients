const utils = require('../utils/utils');
const LanguageSummary = require('../models/LanguageSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}effect`,
                label: `[${labelPrefix}effect]`,
                required: true,
                type: 'string',
            },
            ...LanguageSummary.fields(`${keyPrefix}language`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'effect': bundle.inputData?.[`${keyPrefix}effect`],
            'language': utils.removeIfEmpty(LanguageSummary.mapping(bundle, `${keyPrefix}language`)),
        }
    },
}
