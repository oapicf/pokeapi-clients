const utils = require('../utils/utils');
const PokemonFormFlavorText = require('../models/PokemonFormFlavorText');
const PokemonFormName = require('../models/PokemonFormName');
const PokemonFormSprites = require('../models/PokemonFormSprites');
const PokemonFormTriggerCondition = require('../models/PokemonFormTriggerCondition');
const PokemonFormType = require('../models/PokemonFormType');
const PokemonSummary = require('../models/PokemonSummary');
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
                key: `${keyPrefix}order`,
                label: `The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. - [${labelPrefix}order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}form_order`,
                label: `The order in which forms should be sorted within a species' forms. - [${labelPrefix}form_order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_default`,
                label: `True for exactly one form used as the default for each Pokémon. - [${labelPrefix}is_default]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_battle_only`,
                label: `Whether or not this form can only happen during battle. - [${labelPrefix}is_battle_only]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_mega`,
                label: `Whether or not this form requires mega evolution. - [${labelPrefix}is_mega]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}form_name`,
                label: `The name of this form. - [${labelPrefix}form_name]`,
                required: true,
                type: 'string',
            },
            ...PokemonSummary.fields(`${keyPrefix}pokemon`, isInput),
            ...PokemonFormSprites.fields(`${keyPrefix}sprites`, isInput),
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
            {
                key: `${keyPrefix}form_names`,
                label: `[${labelPrefix}form_names]`,
                children: PokemonFormName.fields(`${keyPrefix}form_names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokemonFormName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}types`,
                label: `[${labelPrefix}types]`,
                children: PokemonFormType.fields(`${keyPrefix}types${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}trigger_conditions`,
                label: `[${labelPrefix}trigger_conditions]`,
                children: PokemonFormTriggerCondition.fields(`${keyPrefix}trigger_conditions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: PokemonFormFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
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
            'sprites': utils.removeIfEmpty(PokemonFormSprites.mapping(bundle, `${keyPrefix}sprites`)),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
            'form_names': utils.childMapping(bundle.inputData?.[`${keyPrefix}form_names`], `${keyPrefix}form_names`, PokemonFormName),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokemonFormName),
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, PokemonFormType),
            'trigger_conditions': utils.childMapping(bundle.inputData?.[`${keyPrefix}trigger_conditions`], `${keyPrefix}trigger_conditions`, PokemonFormTriggerCondition),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, PokemonFormFlavorText),
        }
    },
}
