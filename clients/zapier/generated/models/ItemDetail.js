const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const ItemCategorySummary = require('../models/ItemCategorySummary');
const ItemDetail_baby_trigger_for = require('../models/ItemDetail_baby_trigger_for');
const ItemDetail_held_by_pokemon_inner = require('../models/ItemDetail_held_by_pokemon_inner');
const ItemDetail_machines_inner = require('../models/ItemDetail_machines_inner');
const ItemDetail_sprites = require('../models/ItemDetail_sprites');
const ItemEffectText = require('../models/ItemEffectText');
const ItemFlavorText = require('../models/ItemFlavorText');
const ItemFlingEffectSummary = require('../models/ItemFlingEffectSummary');
const ItemGameIndex = require('../models/ItemGameIndex');
const ItemName = require('../models/ItemName');

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
                key: `${keyPrefix}cost`,
                label: `[${labelPrefix}cost]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}fling_power`,
                label: `[${labelPrefix}fling_power]`,
                type: 'integer',
            },
            ...ItemFlingEffectSummary.fields(`${keyPrefix}fling_effect`, isInput),
            {
                key: `${keyPrefix}attributes`,
                label: `[${labelPrefix}attributes]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}attributes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ItemCategorySummary.fields(`${keyPrefix}category`, isInput),
            {
                key: `${keyPrefix}effect_entries`,
                label: `[${labelPrefix}effect_entries]`,
                children: ItemEffectText.fields(`${keyPrefix}effect_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: ItemFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}game_indices`,
                label: `[${labelPrefix}game_indices]`,
                children: ItemGameIndex.fields(`${keyPrefix}game_indices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: ItemName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}held_by_pokemon`,
                label: `[${labelPrefix}held_by_pokemon]`,
                children: ItemDetail_held_by_pokemon_inner.fields(`${keyPrefix}held_by_pokemon${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ItemDetail_sprites.fields(`${keyPrefix}sprites`, isInput),
            ...ItemDetail_baby_trigger_for.fields(`${keyPrefix}baby_trigger_for`, isInput),
            {
                key: `${keyPrefix}machines`,
                label: `[${labelPrefix}machines]`,
                children: ItemDetail_machines_inner.fields(`${keyPrefix}machines${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'cost': bundle.inputData?.[`${keyPrefix}cost`],
            'fling_power': bundle.inputData?.[`${keyPrefix}fling_power`],
            'fling_effect': utils.removeIfEmpty(ItemFlingEffectSummary.mapping(bundle, `${keyPrefix}fling_effect`)),
            'attributes': utils.childMapping(bundle.inputData?.[`${keyPrefix}attributes`], `${keyPrefix}attributes`, AbilityDetail_pokemon_inner_pokemon),
            'category': utils.removeIfEmpty(ItemCategorySummary.mapping(bundle, `${keyPrefix}category`)),
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, ItemEffectText),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, ItemFlavorText),
            'game_indices': utils.childMapping(bundle.inputData?.[`${keyPrefix}game_indices`], `${keyPrefix}game_indices`, ItemGameIndex),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, ItemName),
            'held_by_pokemon': utils.childMapping(bundle.inputData?.[`${keyPrefix}held_by_pokemon`], `${keyPrefix}held_by_pokemon`, ItemDetail_held_by_pokemon_inner),
            'sprites': utils.removeIfEmpty(ItemDetail_sprites.mapping(bundle, `${keyPrefix}sprites`)),
            'baby_trigger_for': utils.removeIfEmpty(ItemDetail_baby_trigger_for.mapping(bundle, `${keyPrefix}baby_trigger_for`)),
            'machines': utils.childMapping(bundle.inputData?.[`${keyPrefix}machines`], `${keyPrefix}machines`, ItemDetail_machines_inner),
        }
    },
}
