const utils = require('../utils/utils');
const ContestEffectEffectText = require('../models/ContestEffectEffectText');
const ContestEffectFlavorText = require('../models/ContestEffectFlavorText');

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
                key: `${keyPrefix}appeal`,
                label: `[${labelPrefix}appeal]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}jam`,
                label: `[${labelPrefix}jam]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}effect_entries`,
                label: `[${labelPrefix}effect_entries]`,
                children: ContestEffectEffectText.fields(`${keyPrefix}effect_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: ContestEffectFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'appeal': bundle.inputData?.[`${keyPrefix}appeal`],
            'jam': bundle.inputData?.[`${keyPrefix}jam`],
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, ContestEffectEffectText),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, ContestEffectFlavorText),
        }
    },
}
