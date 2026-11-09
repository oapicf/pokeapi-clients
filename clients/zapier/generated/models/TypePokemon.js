const utils = require('../utils/utils');
const PokemonSummary = require('../models/PokemonSummary');

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
            ...PokemonSummary.fields(`${keyPrefix}pokemon`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'slot': bundle.inputData?.[`${keyPrefix}slot`],
            'pokemon': utils.removeIfEmpty(PokemonSummary.mapping(bundle, `${keyPrefix}pokemon`)),
        }
    },
}
