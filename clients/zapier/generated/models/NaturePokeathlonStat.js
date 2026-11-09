const utils = require('../utils/utils');
const PokeathlonStatSummary = require('../models/PokeathlonStatSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}max_change`,
                label: `The amount of change. - [${labelPrefix}max_change]`,
                required: true,
                type: 'integer',
            },
            ...PokeathlonStatSummary.fields(`${keyPrefix}pokeathlon_stat`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'max_change': bundle.inputData?.[`${keyPrefix}max_change`],
            'pokeathlon_stat': utils.removeIfEmpty(PokeathlonStatSummary.mapping(bundle, `${keyPrefix}pokeathlon_stat`)),
        }
    },
}
