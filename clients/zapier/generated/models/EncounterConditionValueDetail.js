const utils = require('../utils/utils');
const EncounterConditionSummary = require('../models/EncounterConditionSummary');
const EncounterConditionValueName = require('../models/EncounterConditionValueName');

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
            ...EncounterConditionSummary.fields(`${keyPrefix}condition`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: EncounterConditionValueName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'condition': utils.removeIfEmpty(EncounterConditionSummary.mapping(bundle, `${keyPrefix}condition`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, EncounterConditionValueName),
        }
    },
}
