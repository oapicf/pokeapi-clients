const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const PokedexDescription = require('../models/PokedexDescription');
const PokedexDetail_pokemon_entries_inner = require('../models/PokedexDetail_pokemon_entries_inner');
const PokedexName = require('../models/PokedexName');
const RegionSummary = require('../models/RegionSummary');

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
                key: `${keyPrefix}is_main_series`,
                label: `[${labelPrefix}is_main_series]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}descriptions`,
                label: `[${labelPrefix}descriptions]`,
                children: PokedexDescription.fields(`${keyPrefix}descriptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokedexName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon_entries`,
                label: `[${labelPrefix}pokemon_entries]`,
                children: PokedexDetail_pokemon_entries_inner.fields(`${keyPrefix}pokemon_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...RegionSummary.fields(`${keyPrefix}region`, isInput),
            {
                key: `${keyPrefix}version_groups`,
                label: `[${labelPrefix}version_groups]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}version_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'is_main_series': bundle.inputData?.[`${keyPrefix}is_main_series`],
            'descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}descriptions`], `${keyPrefix}descriptions`, PokedexDescription),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokedexName),
            'pokemon_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_entries`], `${keyPrefix}pokemon_entries`, PokedexDetail_pokemon_entries_inner),
            'region': utils.removeIfEmpty(RegionSummary.mapping(bundle, `${keyPrefix}region`)),
            'version_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_groups`], `${keyPrefix}version_groups`, AbilityDetail_pokemon_inner_pokemon),
        }
    },
}
