const utils = require('../utils/utils');
const BerryFirmnessName = require('../models/BerryFirmnessName');
const BerrySummary = require('../models/BerrySummary');

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
                children: BerrySummary.fields(`${keyPrefix}berries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: BerryFirmnessName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'berries': utils.childMapping(bundle.inputData?.[`${keyPrefix}berries`], `${keyPrefix}berries`, BerrySummary),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, BerryFirmnessName),
        }
    },
}
