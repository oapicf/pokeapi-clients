const utils = require('../utils/utils');
const EvolutionChainSummary = require('../models/EvolutionChainSummary');
const ItemAttributeSummary = require('../models/ItemAttributeSummary');
const ItemCategorySummary = require('../models/ItemCategorySummary');
const ItemEffectText = require('../models/ItemEffectText');
const ItemFlavorText = require('../models/ItemFlavorText');
const ItemFlingEffectSummary = require('../models/ItemFlingEffectSummary');
const ItemGameIndex = require('../models/ItemGameIndex');
const ItemMachine = require('../models/ItemMachine');
const ItemName = require('../models/ItemName');
const ItemPrice = require('../models/ItemPrice');
const ItemSprites = require('../models/ItemSprites');
const PokemonHeldItem = require('../models/PokemonHeldItem');

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
                key: `${keyPrefix}fling_power`,
                label: `The power of the move Fling when used with this item. - [${labelPrefix}fling_power]`,
                type: 'integer',
            },
            ...ItemFlingEffectSummary.fields(`${keyPrefix}fling_effect`, isInput),
            {
                key: `${keyPrefix}attributes`,
                label: `[${labelPrefix}attributes]`,
                children: ItemAttributeSummary.fields(`${keyPrefix}attributes${!isInput ? '[]' : ''}`, isInput, true), 
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
                key: `${keyPrefix}prices`,
                label: `[${labelPrefix}prices]`,
                children: ItemPrice.fields(`${keyPrefix}prices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: ItemName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}held_by_pokemon`,
                label: `[${labelPrefix}held_by_pokemon]`,
                children: PokemonHeldItem.fields(`${keyPrefix}held_by_pokemon${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ItemSprites.fields(`${keyPrefix}sprites`, isInput),
            ...EvolutionChainSummary.fields(`${keyPrefix}baby_trigger_for`, isInput),
            {
                key: `${keyPrefix}machines`,
                label: `[${labelPrefix}machines]`,
                children: ItemMachine.fields(`${keyPrefix}machines${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'fling_power': bundle.inputData?.[`${keyPrefix}fling_power`],
            'fling_effect': utils.removeIfEmpty(ItemFlingEffectSummary.mapping(bundle, `${keyPrefix}fling_effect`)),
            'attributes': utils.childMapping(bundle.inputData?.[`${keyPrefix}attributes`], `${keyPrefix}attributes`, ItemAttributeSummary),
            'category': utils.removeIfEmpty(ItemCategorySummary.mapping(bundle, `${keyPrefix}category`)),
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, ItemEffectText),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, ItemFlavorText),
            'game_indices': utils.childMapping(bundle.inputData?.[`${keyPrefix}game_indices`], `${keyPrefix}game_indices`, ItemGameIndex),
            'prices': utils.childMapping(bundle.inputData?.[`${keyPrefix}prices`], `${keyPrefix}prices`, ItemPrice),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, ItemName),
            'held_by_pokemon': utils.childMapping(bundle.inputData?.[`${keyPrefix}held_by_pokemon`], `${keyPrefix}held_by_pokemon`, PokemonHeldItem),
            'sprites': utils.removeIfEmpty(ItemSprites.mapping(bundle, `${keyPrefix}sprites`)),
            'baby_trigger_for': utils.removeIfEmpty(EvolutionChainSummary.mapping(bundle, `${keyPrefix}baby_trigger_for`)),
            'machines': utils.childMapping(bundle.inputData?.[`${keyPrefix}machines`], `${keyPrefix}machines`, ItemMachine),
        }
    },
}
