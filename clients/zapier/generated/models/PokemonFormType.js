const utils = require('../utils/utils');
const TypeSummary = require('../models/TypeSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}slot`,
                label: `The order the Pokémon's types are listed in. - [${labelPrefix}slot]`,
                required: true,
                type: 'integer',
            },
            ...TypeSummary.fields(`${keyPrefix}type`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'slot': bundle.inputData?.[`${keyPrefix}slot`],
            'type': utils.removeIfEmpty(TypeSummary.mapping(bundle, `${keyPrefix}type`)),
        }
    },
}
