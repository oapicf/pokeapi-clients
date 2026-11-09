const utils = require('../utils/utils');
const ItemSummary = require('../models/ItemSummary');
const PokemonHeldItemVersion = require('../models/PokemonHeldItemVersion');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ItemSummary.fields(`${keyPrefix}item`, isInput),
            {
                key: `${keyPrefix}version_details`,
                label: `[${labelPrefix}version_details]`,
                children: PokemonHeldItemVersion.fields(`${keyPrefix}version_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item': utils.removeIfEmpty(ItemSummary.mapping(bundle, `${keyPrefix}item`)),
            'version_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_details`], `${keyPrefix}version_details`, PokemonHeldItemVersion),
        }
    },
}
