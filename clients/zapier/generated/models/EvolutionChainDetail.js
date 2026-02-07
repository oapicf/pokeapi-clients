const utils = require('../utils/utils');
const EvolutionChainDetail_chain = require('../models/EvolutionChainDetail_chain');
const ItemSummary = require('../models/ItemSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            ...ItemSummary.fields(`${keyPrefix}baby_trigger_item`, isInput),
            ...EvolutionChainDetail_chain.fields(`${keyPrefix}chain`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'baby_trigger_item': utils.removeIfEmpty(ItemSummary.mapping(bundle, `${keyPrefix}baby_trigger_item`)),
            'chain': utils.removeIfEmpty(EvolutionChainDetail_chain.mapping(bundle, `${keyPrefix}chain`)),
        }
    },
}
