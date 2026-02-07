const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const EvolutionTriggerName = require('../models/EvolutionTriggerName');

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
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: EvolutionTriggerName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon_species`,
                label: `[${labelPrefix}pokemon_species]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokemon_species${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, EvolutionTriggerName),
            'pokemon_species': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_species`], `${keyPrefix}pokemon_species`, AbilityDetail_pokemon_inner_pokemon),
        }
    },
}
