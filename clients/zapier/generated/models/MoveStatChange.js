const utils = require('../utils/utils');
const MoveSummary = require('../models/MoveSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}change`,
                label: `The maximum amount of change to the referenced stat. - [${labelPrefix}change]`,
                required: true,
                type: 'integer',
            },
            ...MoveSummary.fields(`${keyPrefix}move`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'change': bundle.inputData?.[`${keyPrefix}change`],
            'move': utils.removeIfEmpty(MoveSummary.mapping(bundle, `${keyPrefix}move`)),
        }
    },
}
