const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');

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
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'game_index': bundle.inputData?.[`${keyPrefix}game_index`],
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
        }
    },
}
