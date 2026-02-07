const utils = require('../utils/utils');
const BerryDetail_flavors_inner = require('../models/BerryDetail_flavors_inner');
const BerryFirmnessSummary = require('../models/BerryFirmnessSummary');
const ItemSummary = require('../models/ItemSummary');
const TypeSummary = require('../models/TypeSummary');

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
                key: `${keyPrefix}growth_time`,
                label: `[${labelPrefix}growth_time]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_harvest`,
                label: `[${labelPrefix}max_harvest]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}natural_gift_power`,
                label: `[${labelPrefix}natural_gift_power]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}size`,
                label: `[${labelPrefix}size]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}smoothness`,
                label: `[${labelPrefix}smoothness]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}soil_dryness`,
                label: `[${labelPrefix}soil_dryness]`,
                required: true,
                type: 'integer',
            },
            ...BerryFirmnessSummary.fields(`${keyPrefix}firmness`, isInput),
            {
                key: `${keyPrefix}flavors`,
                label: `[${labelPrefix}flavors]`,
                children: BerryDetail_flavors_inner.fields(`${keyPrefix}flavors${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ItemSummary.fields(`${keyPrefix}item`, isInput),
            ...TypeSummary.fields(`${keyPrefix}natural_gift_type`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'growth_time': bundle.inputData?.[`${keyPrefix}growth_time`],
            'max_harvest': bundle.inputData?.[`${keyPrefix}max_harvest`],
            'natural_gift_power': bundle.inputData?.[`${keyPrefix}natural_gift_power`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'smoothness': bundle.inputData?.[`${keyPrefix}smoothness`],
            'soil_dryness': bundle.inputData?.[`${keyPrefix}soil_dryness`],
            'firmness': utils.removeIfEmpty(BerryFirmnessSummary.mapping(bundle, `${keyPrefix}firmness`)),
            'flavors': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavors`], `${keyPrefix}flavors`, BerryDetail_flavors_inner),
            'item': utils.removeIfEmpty(ItemSummary.mapping(bundle, `${keyPrefix}item`)),
            'natural_gift_type': utils.removeIfEmpty(TypeSummary.mapping(bundle, `${keyPrefix}natural_gift_type`)),
        }
    },
}
