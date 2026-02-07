const utils = require('../utils/utils');
const VersionSummary = require('../models/VersionSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}game_index`,
                label: `[${labelPrefix}game_index]`,
                required: true,
                type: 'integer',
            },
            ...VersionSummary.fields(`${keyPrefix}version`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'game_index': bundle.inputData?.[`${keyPrefix}game_index`],
            'version': utils.removeIfEmpty(VersionSummary.mapping(bundle, `${keyPrefix}version`)),
        }
    },
}
