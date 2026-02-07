const utils = require('../utils/utils');
const ItemCategoryName = require('../models/ItemCategoryName');
const ItemPocketSummary = require('../models/ItemPocketSummary');
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
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: ItemSummary.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: ItemCategoryName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ItemPocketSummary.fields(`${keyPrefix}pocket`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, ItemSummary),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, ItemCategoryName),
            'pocket': utils.removeIfEmpty(ItemPocketSummary.mapping(bundle, `${keyPrefix}pocket`)),
        }
    },
}
