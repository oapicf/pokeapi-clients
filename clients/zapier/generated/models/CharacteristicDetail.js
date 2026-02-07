const utils = require('../utils/utils');
const CharacteristicDescription = require('../models/CharacteristicDescription');
const StatSummary = require('../models/StatSummary');

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
                key: `${keyPrefix}gene_modulo`,
                label: `[${labelPrefix}gene_modulo]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}possible_values`,
                label: `[${labelPrefix}possible_values]`,
                required: true,
                list: true,
                type: 'integer',
            },
            ...StatSummary.fields(`${keyPrefix}highest_stat`, isInput),
            {
                key: `${keyPrefix}descriptions`,
                label: `[${labelPrefix}descriptions]`,
                children: CharacteristicDescription.fields(`${keyPrefix}descriptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'gene_modulo': bundle.inputData?.[`${keyPrefix}gene_modulo`],
            'possible_values': bundle.inputData?.[`${keyPrefix}possible_values`],
            'highest_stat': utils.removeIfEmpty(StatSummary.mapping(bundle, `${keyPrefix}highest_stat`)),
            'descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}descriptions`], `${keyPrefix}descriptions`, CharacteristicDescription),
        }
    },
}
