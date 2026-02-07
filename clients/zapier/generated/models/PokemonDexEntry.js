const utils = require('../utils/utils');
const PokedexSummary = require('../models/PokedexSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}entry_number`,
                label: `[${labelPrefix}entry_number]`,
                required: true,
                type: 'integer',
            },
            ...PokedexSummary.fields(`${keyPrefix}pokedex`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'entry_number': bundle.inputData?.[`${keyPrefix}entry_number`],
            'pokedex': utils.removeIfEmpty(PokedexSummary.mapping(bundle, `${keyPrefix}pokedex`)),
        }
    },
}
