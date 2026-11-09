const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');
const MoveLearnMethodSummary = require('../models/MoveLearnMethodSummary');
const PokedexSummary = require('../models/PokedexSummary');
const RegionSummary = require('../models/RegionSummary');
const VersionSummary = require('../models/VersionSummary');

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
                label: `Order for sorting. Almost by date of release, except similar versions are grouped together. - [${labelPrefix}order]`,
                type: 'integer',
            },
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            {
                key: `${keyPrefix}move_learn_methods`,
                label: `[${labelPrefix}move_learn_methods]`,
                children: MoveLearnMethodSummary.fields(`${keyPrefix}move_learn_methods${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokedexes`,
                label: `[${labelPrefix}pokedexes]`,
                children: PokedexSummary.fields(`${keyPrefix}pokedexes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}regions`,
                label: `[${labelPrefix}regions]`,
                children: RegionSummary.fields(`${keyPrefix}regions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}versions`,
                label: `[${labelPrefix}versions]`,
                children: VersionSummary.fields(`${keyPrefix}versions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'order': bundle.inputData?.[`${keyPrefix}order`],
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'move_learn_methods': utils.childMapping(bundle.inputData?.[`${keyPrefix}move_learn_methods`], `${keyPrefix}move_learn_methods`, MoveLearnMethodSummary),
            'pokedexes': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokedexes`], `${keyPrefix}pokedexes`, PokedexSummary),
            'regions': utils.childMapping(bundle.inputData?.[`${keyPrefix}regions`], `${keyPrefix}regions`, RegionSummary),
            'versions': utils.childMapping(bundle.inputData?.[`${keyPrefix}versions`], `${keyPrefix}versions`, VersionSummary),
        }
    },
}
