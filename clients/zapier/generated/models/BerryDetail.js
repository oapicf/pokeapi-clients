const utils = require('../utils/utils');
const BerryFirmnessSummary = require('../models/BerryFirmnessSummary');
const BerryFlavorMap = require('../models/BerryFlavorMap');
const ItemSummary = require('../models/ItemSummary');
const TypeSummary = require('../models/TypeSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier for this resource. - [${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name for this resource. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}growth_time`,
                label: `Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. - [${labelPrefix}growth_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_harvest`,
                label: `The maximum number of these berries that can grow on one tree in Generation IV. - [${labelPrefix}max_harvest]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}natural_gift_power`,
                label: `The power of the move \"Natural Gift\" when used with this Berry. - [${labelPrefix}natural_gift_power]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}size`,
                label: `The size of this Berry, in millimeters. - [${labelPrefix}size]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}smoothness`,
                label: `The smoothness of this Berry, used in making Pokéblocks or Poffins. - [${labelPrefix}smoothness]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}soil_dryness`,
                label: `The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. - [${labelPrefix}soil_dryness]`,
                type: 'integer',
            },
            ...BerryFirmnessSummary.fields(`${keyPrefix}firmness`, isInput),
            {
                key: `${keyPrefix}flavors`,
                label: `[${labelPrefix}flavors]`,
                children: BerryFlavorMap.fields(`${keyPrefix}flavors${!isInput ? '[]' : ''}`, isInput, true), 
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
            'flavors': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavors`], `${keyPrefix}flavors`, BerryFlavorMap),
            'item': utils.removeIfEmpty(ItemSummary.mapping(bundle, `${keyPrefix}item`)),
            'natural_gift_type': utils.removeIfEmpty(TypeSummary.mapping(bundle, `${keyPrefix}natural_gift_type`)),
        }
    },
}
