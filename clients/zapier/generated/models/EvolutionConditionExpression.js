const utils = require('../utils/utils');
const EvolutionVariableSummary = require('../models/EvolutionVariableSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}expression`,
                label: `Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==') - [${labelPrefix}expression]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}percentage_chance`,
                label: `Percentage chance of evolution under this condition (0-100) - [${labelPrefix}percentage_chance]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}variables`,
                label: `[${labelPrefix}variables]`,
                children: EvolutionVariableSummary.fields(`${keyPrefix}variables${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'expression': bundle.inputData?.[`${keyPrefix}expression`],
            'percentage_chance': bundle.inputData?.[`${keyPrefix}percentage_chance`],
            'variables': utils.childMapping(bundle.inputData?.[`${keyPrefix}variables`], `${keyPrefix}variables`, EvolutionVariableSummary),
        }
    },
}
