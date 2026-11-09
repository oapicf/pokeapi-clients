const utils = require('../utils/utils');
const PokemonFormSummary = require('../models/PokemonFormSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}trigger`,
                label: `The trigger for this form change. - [${labelPrefix}trigger]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the required item, ability, or move. Only present for a resource-based trigger. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}url`,
                label: `The URL of the required item, ability, or move. Only present for a resource-based trigger. - [${labelPrefix}url]`,
                type: 'string',
            },
            ...PokemonFormSummary.fields(`${keyPrefix}base_form`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'trigger': bundle.inputData?.[`${keyPrefix}trigger`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'base_form': utils.removeIfEmpty(PokemonFormSummary.mapping(bundle, `${keyPrefix}base_form`)),
        }
    },
}
