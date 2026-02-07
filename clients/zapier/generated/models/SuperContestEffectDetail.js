const utils = require('../utils/utils');
const MoveSummary = require('../models/MoveSummary');
const SuperContestEffectFlavorText = require('../models/SuperContestEffectFlavorText');

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
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: SuperContestEffectFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: MoveSummary.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'appeal': bundle.inputData?.[`${keyPrefix}appeal`],
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, SuperContestEffectFlavorText),
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, MoveSummary),
        }
    },
}
