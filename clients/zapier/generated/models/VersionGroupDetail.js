const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const GenerationSummary = require('../models/GenerationSummary');
const VersionSummary = require('../models/VersionSummary');

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
                key: `${keyPrefix}order`,
                label: `[${labelPrefix}order]`,
                type: 'integer',
            },
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            {
                key: `${keyPrefix}move_learn_methods`,
                label: `[${labelPrefix}move_learn_methods]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}move_learn_methods${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokedexes`,
                label: `[${labelPrefix}pokedexes]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokedexes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}regions`,
                label: `[${labelPrefix}regions]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}regions${!isInput ? '[]' : ''}`, isInput, true), 
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
            'move_learn_methods': utils.childMapping(bundle.inputData?.[`${keyPrefix}move_learn_methods`], `${keyPrefix}move_learn_methods`, AbilityDetail_pokemon_inner_pokemon),
            'pokedexes': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokedexes`], `${keyPrefix}pokedexes`, AbilityDetail_pokemon_inner_pokemon),
            'regions': utils.childMapping(bundle.inputData?.[`${keyPrefix}regions`], `${keyPrefix}regions`, AbilityDetail_pokemon_inner_pokemon),
            'versions': utils.childMapping(bundle.inputData?.[`${keyPrefix}versions`], `${keyPrefix}versions`, VersionSummary),
        }
    },
}
