const utils = require('../utils/utils');
const ItemSummary = require('../models/ItemSummary');
const MoveSummary = require('../models/MoveSummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

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
            ...ItemSummary.fields(`${keyPrefix}item`, isInput),
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
            ...MoveSummary.fields(`${keyPrefix}move`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'item': utils.removeIfEmpty(ItemSummary.mapping(bundle, `${keyPrefix}item`)),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
            'move': utils.removeIfEmpty(MoveSummary.mapping(bundle, `${keyPrefix}move`)),
        }
    },
}
