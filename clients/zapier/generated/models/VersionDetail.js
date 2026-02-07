const utils = require('../utils/utils');
const VersionGroupSummary = require('../models/VersionGroupSummary');
const VersionName = require('../models/VersionName');

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
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: VersionName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, VersionName),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
        }
    },
}
