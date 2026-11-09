const utils = require('../utils/utils');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}count`,
                label: `The total number of resources available from this API. - [${labelPrefix}count]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}next`,
                label: `The URL for the next page in the list, or null if there is no next page. - [${labelPrefix}next]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}previous`,
                label: `The URL for the previous page in the list, or null if there is no previous page. - [${labelPrefix}previous]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}results`,
                label: `[${labelPrefix}results]`,
                children: PokemonSpeciesSummary.fields(`${keyPrefix}results${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'next': bundle.inputData?.[`${keyPrefix}next`],
            'previous': bundle.inputData?.[`${keyPrefix}previous`],
            'results': utils.childMapping(bundle.inputData?.[`${keyPrefix}results`], `${keyPrefix}results`, PokemonSpeciesSummary),
        }
    },
}
