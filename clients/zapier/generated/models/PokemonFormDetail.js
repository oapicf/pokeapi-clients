const utils = require('../utils/utils');
const PokemonDetail_types_inner = require('../models/PokemonDetail_types_inner');
const PokemonFormDetail_form_names_inner = require('../models/PokemonFormDetail_form_names_inner');
const PokemonFormDetail_sprites = require('../models/PokemonFormDetail_sprites');
const PokemonSummary = require('../models/PokemonSummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

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
                key: `${keyPrefix}order`,
                label: `[${labelPrefix}order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}form_order`,
                label: `[${labelPrefix}form_order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_default`,
                label: `[${labelPrefix}is_default]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_battle_only`,
                label: `[${labelPrefix}is_battle_only]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_mega`,
                label: `[${labelPrefix}is_mega]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}form_name`,
                label: `[${labelPrefix}form_name]`,
                required: true,
                type: 'string',
            },
            ...PokemonSummary.fields(`${keyPrefix}pokemon`, isInput),
            ...PokemonFormDetail_sprites.fields(`${keyPrefix}sprites`, isInput),
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
            {
                key: `${keyPrefix}form_names`,
                label: `[${labelPrefix}form_names]`,
                children: PokemonFormDetail_form_names_inner.fields(`${keyPrefix}form_names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokemonFormDetail_form_names_inner.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}types`,
                label: `[${labelPrefix}types]`,
                children: PokemonDetail_types_inner.fields(`${keyPrefix}types${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'order': bundle.inputData?.[`${keyPrefix}order`],
            'form_order': bundle.inputData?.[`${keyPrefix}form_order`],
            'is_default': bundle.inputData?.[`${keyPrefix}is_default`],
            'is_battle_only': bundle.inputData?.[`${keyPrefix}is_battle_only`],
            'is_mega': bundle.inputData?.[`${keyPrefix}is_mega`],
            'form_name': bundle.inputData?.[`${keyPrefix}form_name`],
            'pokemon': utils.removeIfEmpty(PokemonSummary.mapping(bundle, `${keyPrefix}pokemon`)),
            'sprites': utils.removeIfEmpty(PokemonFormDetail_sprites.mapping(bundle, `${keyPrefix}sprites`)),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
            'form_names': utils.childMapping(bundle.inputData?.[`${keyPrefix}form_names`], `${keyPrefix}form_names`, PokemonFormDetail_form_names_inner),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokemonFormDetail_form_names_inner),
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, PokemonDetail_types_inner),
        }
    },
}
