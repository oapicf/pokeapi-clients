const utils = require('../utils/utils');
const AbilitySummary = require('../models/AbilitySummary');
const GenerationName = require('../models/GenerationName');
const MoveSummary = require('../models/MoveSummary');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');
const RegionSummary = require('../models/RegionSummary');
const TypeSummary = require('../models/TypeSummary');
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
                key: `${keyPrefix}abilities`,
                label: `[${labelPrefix}abilities]`,
                children: AbilitySummary.fields(`${keyPrefix}abilities${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...RegionSummary.fields(`${keyPrefix}main_region`, isInput),
            {
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: MoveSummary.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: GenerationName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon_species`,
                label: `[${labelPrefix}pokemon_species]`,
                children: PokemonSpeciesSummary.fields(`${keyPrefix}pokemon_species${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}types`,
                label: `[${labelPrefix}types]`,
                children: TypeSummary.fields(`${keyPrefix}types${!isInput ? '[]' : ''}`, isInput, true), 
            },
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
            'abilities': utils.childMapping(bundle.inputData?.[`${keyPrefix}abilities`], `${keyPrefix}abilities`, AbilitySummary),
            'main_region': utils.removeIfEmpty(RegionSummary.mapping(bundle, `${keyPrefix}main_region`)),
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, MoveSummary),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, GenerationName),
            'pokemon_species': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_species`], `${keyPrefix}pokemon_species`, PokemonSpeciesSummary),
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, TypeSummary),
            'version_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_groups`], `${keyPrefix}version_groups`, VersionGroupSummary),
        }
    },
}
