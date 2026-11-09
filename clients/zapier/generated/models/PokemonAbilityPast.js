const utils = require('../utils/utils');
const AbilitySummary = require('../models/AbilitySummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_hidden`,
                label: `Whether or not this is a hidden ability. - [${labelPrefix}is_hidden]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}slot`,
                label: `The slot this ability occupies in this Pokémon species. - [${labelPrefix}slot]`,
                required: true,
                type: 'integer',
            },
            ...AbilitySummary.fields(`${keyPrefix}ability`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_hidden': bundle.inputData?.[`${keyPrefix}is_hidden`],
            'slot': bundle.inputData?.[`${keyPrefix}slot`],
            'ability': utils.removeIfEmpty(AbilitySummary.mapping(bundle, `${keyPrefix}ability`)),
        }
    },
}
