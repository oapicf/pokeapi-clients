const utils = require('../utils/utils');
const LanguageName = require('../models/LanguageName');

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
                key: `${keyPrefix}official`,
                label: `Whether or not the games are published in this language. - [${labelPrefix}official]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}iso639`,
                label: `The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. - [${labelPrefix}iso639]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}iso3166`,
                label: `The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. - [${labelPrefix}iso3166]`,
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
