const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}use_before`,
                label: `[${labelPrefix}use_before]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}use_before${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}use_after`,
                label: `[${labelPrefix}use_after]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}use_after${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'use_before': utils.childMapping(bundle.inputData?.[`${keyPrefix}use_before`], `${keyPrefix}use_before`, AbilityDetail_pokemon_inner_pokemon),
            'use_after': utils.childMapping(bundle.inputData?.[`${keyPrefix}use_after`], `${keyPrefix}use_after`, AbilityDetail_pokemon_inner_pokemon),
        }
    },
}
