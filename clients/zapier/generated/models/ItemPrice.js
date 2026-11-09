const utils = require('../utils/utils');
const CurrencySummary = require('../models/CurrencySummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}purchase_price`,
                label: `The purchase price in this currency and version group, or null if unavailable. - [${labelPrefix}purchase_price]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}sell_price`,
                label: `The sell price in this currency and version group, or null if unavailable. - [${labelPrefix}sell_price]`,
                type: 'integer',
            },
            ...CurrencySummary.fields(`${keyPrefix}currency`, isInput),
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'purchase_price': bundle.inputData?.[`${keyPrefix}purchase_price`],
            'sell_price': bundle.inputData?.[`${keyPrefix}sell_price`],
            'currency': utils.removeIfEmpty(CurrencySummary.mapping(bundle, `${keyPrefix}currency`)),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
        }
    },
}
