const utils = require('../utils/utils');
const PokemonSummary = require('../models/PokemonSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_default`,
                label: `Whether this variety is the default variety. - [${labelPrefix}is_default]`,
                required: true,
                type: 'boolean',
            },
            ...PokemonSummary.fields(`${keyPrefix}pokemon`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_default': bundle.inputData?.[`${keyPrefix}is_default`],
            'pokemon': utils.removeIfEmpty(PokemonSummary.mapping(bundle, `${keyPrefix}pokemon`)),
        }
    },
}
