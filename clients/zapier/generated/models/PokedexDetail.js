const utils = require('../utils/utils');
const PokedexDescription = require('../models/PokedexDescription');
const PokedexName = require('../models/PokedexName');
const PokemonDexNumber = require('../models/PokemonDexNumber');
const RegionSummary = require('../models/RegionSummary');
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
                key: `${keyPrefix}is_main_series`,
                label: `Whether or not this Pokédex originated in the main series of the video games. - [${labelPrefix}is_main_series]`,
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
                children: PokemonDexNumber.fields(`${keyPrefix}pokemon_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...RegionSummary.fields(`${keyPrefix}region`, isInput),
            {
                key: `${keyPrefix}version_groups`,
                label: `[${labelPrefix}version_groups]`,
                children: VersionGroupSummary.fields(`${keyPrefix}version_groups${!isInput ? '[]' : ''}`, isInput, true), 
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
            'pokemon_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_entries`], `${keyPrefix}pokemon_entries`, PokemonDexNumber),
            'region': utils.removeIfEmpty(RegionSummary.mapping(bundle, `${keyPrefix}region`)),
            'version_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_groups`], `${keyPrefix}version_groups`, VersionGroupSummary),
        }
    },
}
