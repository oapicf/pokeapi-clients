const utils = require('../utils/utils');
const EvolutionVariableDescription = require('../models/EvolutionVariableDescription');
const EvolutionVariableName = require('../models/EvolutionVariableName');
const VersionGroupSummary = require('../models/VersionGroupSummary');

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
                key: `${keyPrefix}symbol`,
                label: `The symbol used for this variable in evolution condition expressions. - [${labelPrefix}symbol]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}data_type`,
                label: `The data type of this variable. - [${labelPrefix}data_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}source`,
                label: `The source of the variable value. - [${labelPrefix}source]`,
                type: 'string',
            },
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: EvolutionVariableName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}descriptions`,
                label: `[${labelPrefix}descriptions]`,
                children: EvolutionVariableDescription.fields(`${keyPrefix}descriptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'symbol': bundle.inputData?.[`${keyPrefix}symbol`],
            'data_type': bundle.inputData?.[`${keyPrefix}data_type`],
            'source': bundle.inputData?.[`${keyPrefix}source`],
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, EvolutionVariableName),
            'descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}descriptions`], `${keyPrefix}descriptions`, EvolutionVariableDescription),
        }
    },
}
