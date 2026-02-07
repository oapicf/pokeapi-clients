const utils = require('../utils/utils');
const LanguageName = require('../models/LanguageName');

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
                key: `${keyPrefix}official`,
                label: `[${labelPrefix}official]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}iso639`,
                label: `[${labelPrefix}iso639]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}iso3166`,
                label: `[${labelPrefix}iso3166]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: LanguageName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'official': bundle.inputData?.[`${keyPrefix}official`],
            'iso639': bundle.inputData?.[`${keyPrefix}iso639`],
            'iso3166': bundle.inputData?.[`${keyPrefix}iso3166`],
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, LanguageName),
        }
    },
}
