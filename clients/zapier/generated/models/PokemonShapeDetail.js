const utils = require('../utils/utils');
const PokemonShapeDetail_awesome_names_inner = require('../models/PokemonShapeDetail_awesome_names_inner');
const PokemonShapeDetail_names_inner = require('../models/PokemonShapeDetail_names_inner');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

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
                key: `${keyPrefix}awesome_names`,
                label: `[${labelPrefix}awesome_names]`,
                children: PokemonShapeDetail_awesome_names_inner.fields(`${keyPrefix}awesome_names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokemonShapeDetail_names_inner.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
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
            'awesome_names': utils.childMapping(bundle.inputData?.[`${keyPrefix}awesome_names`], `${keyPrefix}awesome_names`, PokemonShapeDetail_awesome_names_inner),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokemonShapeDetail_names_inner),
            'pokemon_species': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_species`], `${keyPrefix}pokemon_species`, PokemonSpeciesSummary),
        }
    },
}
