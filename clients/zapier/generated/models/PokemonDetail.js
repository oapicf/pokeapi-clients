const utils = require('../utils/utils');
const PokemonAbility = require('../models/PokemonAbility');
const PokemonCries = require('../models/PokemonCries');
const PokemonFormSummary = require('../models/PokemonFormSummary');
const PokemonGameIndex = require('../models/PokemonGameIndex');
const PokemonHeldItemSummary = require('../models/PokemonHeldItemSummary');
const PokemonMove = require('../models/PokemonMove');
const PokemonPastAbility = require('../models/PokemonPastAbility');
const PokemonPastStat = require('../models/PokemonPastStat');
const PokemonPastType = require('../models/PokemonPastType');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');
const PokemonSprites = require('../models/PokemonSprites');
const PokemonStat = require('../models/PokemonStat');
const PokemonType = require('../models/PokemonType');

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
                key: `${keyPrefix}base_experience`,
                label: `The base experience gained for defeating this Pokémon. - [${labelPrefix}base_experience]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}height`,
                label: `The height of this Pokémon in decimetres. - [${labelPrefix}height]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_default`,
                label: `Set for exactly one Pokémon used as the default for each species. - [${labelPrefix}is_default]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}order`,
                label: `Order for sorting. Almost national order, except families are grouped together. - [${labelPrefix}order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}weight`,
                label: `The weight of this Pokémon in hectograms. - [${labelPrefix}weight]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}abilities`,
                label: `[${labelPrefix}abilities]`,
                children: PokemonAbility.fields(`${keyPrefix}abilities${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}past_abilities`,
                label: `[${labelPrefix}past_abilities]`,
                children: PokemonPastAbility.fields(`${keyPrefix}past_abilities${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}forms`,
                label: `[${labelPrefix}forms]`,
                children: PokemonFormSummary.fields(`${keyPrefix}forms${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}game_indices`,
                label: `[${labelPrefix}game_indices]`,
                children: PokemonGameIndex.fields(`${keyPrefix}game_indices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}held_items`,
                label: `[${labelPrefix}held_items]`,
                children: PokemonHeldItemSummary.fields(`${keyPrefix}held_items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}location_area_encounters`,
                label: `A link to a list of location areas, as well as encounter details pertaining to specific versions. - [${labelPrefix}location_area_encounters]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: PokemonMove.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}species`, isInput),
            ...PokemonSprites.fields(`${keyPrefix}sprites`, isInput),
            ...PokemonCries.fields(`${keyPrefix}cries`, isInput),
            {
                key: `${keyPrefix}stats`,
                label: `[${labelPrefix}stats]`,
                children: PokemonStat.fields(`${keyPrefix}stats${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}past_stats`,
                label: `[${labelPrefix}past_stats]`,
                children: PokemonPastStat.fields(`${keyPrefix}past_stats${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}types`,
                label: `[${labelPrefix}types]`,
                children: PokemonType.fields(`${keyPrefix}types${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}past_types`,
                label: `[${labelPrefix}past_types]`,
                children: PokemonPastType.fields(`${keyPrefix}past_types${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'base_experience': bundle.inputData?.[`${keyPrefix}base_experience`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'is_default': bundle.inputData?.[`${keyPrefix}is_default`],
            'order': bundle.inputData?.[`${keyPrefix}order`],
            'weight': bundle.inputData?.[`${keyPrefix}weight`],
            'abilities': utils.childMapping(bundle.inputData?.[`${keyPrefix}abilities`], `${keyPrefix}abilities`, PokemonAbility),
            'past_abilities': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_abilities`], `${keyPrefix}past_abilities`, PokemonPastAbility),
            'forms': utils.childMapping(bundle.inputData?.[`${keyPrefix}forms`], `${keyPrefix}forms`, PokemonFormSummary),
            'game_indices': utils.childMapping(bundle.inputData?.[`${keyPrefix}game_indices`], `${keyPrefix}game_indices`, PokemonGameIndex),
            'held_items': utils.childMapping(bundle.inputData?.[`${keyPrefix}held_items`], `${keyPrefix}held_items`, PokemonHeldItemSummary),
            'location_area_encounters': bundle.inputData?.[`${keyPrefix}location_area_encounters`],
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, PokemonMove),
            'species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}species`)),
            'sprites': utils.removeIfEmpty(PokemonSprites.mapping(bundle, `${keyPrefix}sprites`)),
            'cries': utils.removeIfEmpty(PokemonCries.mapping(bundle, `${keyPrefix}cries`)),
            'stats': utils.childMapping(bundle.inputData?.[`${keyPrefix}stats`], `${keyPrefix}stats`, PokemonStat),
            'past_stats': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_stats`], `${keyPrefix}past_stats`, PokemonPastStat),
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, PokemonType),
            'past_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_types`], `${keyPrefix}past_types`, PokemonPastType),
        }
    },
}
