const utils = require('../utils/utils');
const PokemonDetail_abilities_inner = require('../models/PokemonDetail_abilities_inner');
const PokemonDetail_cries = require('../models/PokemonDetail_cries');
const PokemonDetail_held_items = require('../models/PokemonDetail_held_items');
const PokemonDetail_moves_inner = require('../models/PokemonDetail_moves_inner');
const PokemonDetail_past_abilities_inner = require('../models/PokemonDetail_past_abilities_inner');
const PokemonDetail_past_types_inner = require('../models/PokemonDetail_past_types_inner');
const PokemonDetail_sprites = require('../models/PokemonDetail_sprites');
const PokemonDetail_types_inner = require('../models/PokemonDetail_types_inner');
const PokemonFormSummary = require('../models/PokemonFormSummary');
const PokemonGameIndex = require('../models/PokemonGameIndex');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');
const PokemonStat = require('../models/PokemonStat');

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
                key: `${keyPrefix}base_experience`,
                label: `[${labelPrefix}base_experience]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}height`,
                label: `[${labelPrefix}height]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_default`,
                label: `[${labelPrefix}is_default]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}order`,
                label: `[${labelPrefix}order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}weight`,
                label: `[${labelPrefix}weight]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}abilities`,
                label: `[${labelPrefix}abilities]`,
                children: PokemonDetail_abilities_inner.fields(`${keyPrefix}abilities${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}past_abilities`,
                label: `[${labelPrefix}past_abilities]`,
                children: PokemonDetail_past_abilities_inner.fields(`${keyPrefix}past_abilities${!isInput ? '[]' : ''}`, isInput, true), 
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
            ...PokemonDetail_held_items.fields(`${keyPrefix}held_items`, isInput),
            {
                key: `${keyPrefix}location_area_encounters`,
                label: `[${labelPrefix}location_area_encounters]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: PokemonDetail_moves_inner.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}species`, isInput),
            ...PokemonDetail_sprites.fields(`${keyPrefix}sprites`, isInput),
            ...PokemonDetail_cries.fields(`${keyPrefix}cries`, isInput),
            {
                key: `${keyPrefix}stats`,
                label: `[${labelPrefix}stats]`,
                children: PokemonStat.fields(`${keyPrefix}stats${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}types`,
                label: `[${labelPrefix}types]`,
                children: PokemonDetail_types_inner.fields(`${keyPrefix}types${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}past_types`,
                label: `[${labelPrefix}past_types]`,
                children: PokemonDetail_past_types_inner.fields(`${keyPrefix}past_types${!isInput ? '[]' : ''}`, isInput, true), 
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
            'abilities': utils.childMapping(bundle.inputData?.[`${keyPrefix}abilities`], `${keyPrefix}abilities`, PokemonDetail_abilities_inner),
            'past_abilities': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_abilities`], `${keyPrefix}past_abilities`, PokemonDetail_past_abilities_inner),
            'forms': utils.childMapping(bundle.inputData?.[`${keyPrefix}forms`], `${keyPrefix}forms`, PokemonFormSummary),
            'game_indices': utils.childMapping(bundle.inputData?.[`${keyPrefix}game_indices`], `${keyPrefix}game_indices`, PokemonGameIndex),
            'held_items': utils.removeIfEmpty(PokemonDetail_held_items.mapping(bundle, `${keyPrefix}held_items`)),
            'location_area_encounters': bundle.inputData?.[`${keyPrefix}location_area_encounters`],
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, PokemonDetail_moves_inner),
            'species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}species`)),
            'sprites': utils.removeIfEmpty(PokemonDetail_sprites.mapping(bundle, `${keyPrefix}sprites`)),
            'cries': utils.removeIfEmpty(PokemonDetail_cries.mapping(bundle, `${keyPrefix}cries`)),
            'stats': utils.childMapping(bundle.inputData?.[`${keyPrefix}stats`], `${keyPrefix}stats`, PokemonStat),
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, PokemonDetail_types_inner),
            'past_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_types`], `${keyPrefix}past_types`, PokemonDetail_past_types_inner),
        }
    },
}
