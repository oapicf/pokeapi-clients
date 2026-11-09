const utils = require('../utils/utils');
const PokemonShapeAwesomeName = require('../models/PokemonShapeAwesomeName');
const PokemonShapeName = require('../models/PokemonShapeName');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

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
                key: `${keyPrefix}awesome_names`,
                label: `[${labelPrefix}awesome_names]`,
                children: PokemonShapeAwesomeName.fields(`${keyPrefix}awesome_names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokemonShapeName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon_species`,
                label: `[${labelPrefix}pokemon_species]`,
                children: PokemonSpeciesSummary.fields(`${keyPrefix}pokemon_species${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'awesome_names': utils.childMapping(bundle.inputData?.[`${keyPrefix}awesome_names`], `${keyPrefix}awesome_names`, PokemonShapeAwesomeName),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokemonShapeName),
            'pokemon_species': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_species`], `${keyPrefix}pokemon_species`, PokemonSpeciesSummary),
        }
    },
}
