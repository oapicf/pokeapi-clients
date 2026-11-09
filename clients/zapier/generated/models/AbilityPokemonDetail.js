const utils = require('../utils/utils');
const PokemonSummary = require('../models/PokemonSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_hidden`,
                label: `Whether or not this a hidden ability for the referenced Pokémon. - [${labelPrefix}is_hidden]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}slot`,
                label: `Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. - [${labelPrefix}slot]`,
                required: true,
                type: 'integer',
            },
            ...PokemonSummary.fields(`${keyPrefix}pokemon`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_hidden': bundle.inputData?.[`${keyPrefix}is_hidden`],
            'slot': bundle.inputData?.[`${keyPrefix}slot`],
            'pokemon': utils.removeIfEmpty(PokemonSummary.mapping(bundle, `${keyPrefix}pokemon`)),
        }
    },
}
