const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');
const LocationSummary = require('../models/LocationSummary');
const PokedexSummary = require('../models/PokedexSummary');
const RegionName = require('../models/RegionName');
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
                key: `${keyPrefix}locations`,
                label: `[${labelPrefix}locations]`,
                children: LocationSummary.fields(`${keyPrefix}locations${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...GenerationSummary.fields(`${keyPrefix}main_generation`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: RegionName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokedexes`,
                label: `[${labelPrefix}pokedexes]`,
                children: PokedexSummary.fields(`${keyPrefix}pokedexes${!isInput ? '[]' : ''}`, isInput, true), 
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
            'locations': utils.childMapping(bundle.inputData?.[`${keyPrefix}locations`], `${keyPrefix}locations`, LocationSummary),
            'main_generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}main_generation`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, RegionName),
            'pokedexes': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokedexes`], `${keyPrefix}pokedexes`, PokedexSummary),
            'version_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_groups`], `${keyPrefix}version_groups`, VersionGroupSummary),
        }
    },
}
