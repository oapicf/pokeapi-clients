const utils = require('../utils/utils');
const NatureSummary = require('../models/NatureSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}max_change`,
                label: `The maximum amount of change to the referenced Pokéathlon stat. - [${labelPrefix}max_change]`,
                required: true,
                type: 'integer',
            },
            ...NatureSummary.fields(`${keyPrefix}nature`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'max_change': bundle.inputData?.[`${keyPrefix}max_change`],
            'nature': utils.removeIfEmpty(NatureSummary.mapping(bundle, `${keyPrefix}nature`)),
        }
    },
}
