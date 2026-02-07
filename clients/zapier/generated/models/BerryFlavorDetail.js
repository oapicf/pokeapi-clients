const utils = require('../utils/utils');
const BerryFlavorDetail_berries_inner = require('../models/BerryFlavorDetail_berries_inner');
const BerryFlavorName = require('../models/BerryFlavorName');
const ContestTypeSummary = require('../models/ContestTypeSummary');

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
                key: `${keyPrefix}berries`,
                label: `[${labelPrefix}berries]`,
                children: BerryFlavorDetail_berries_inner.fields(`${keyPrefix}berries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ContestTypeSummary.fields(`${keyPrefix}contest_type`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: BerryFlavorName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'berries': utils.childMapping(bundle.inputData?.[`${keyPrefix}berries`], `${keyPrefix}berries`, BerryFlavorDetail_berries_inner),
            'contest_type': utils.removeIfEmpty(ContestTypeSummary.mapping(bundle, `${keyPrefix}contest_type`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, BerryFlavorName),
        }
    },
}
