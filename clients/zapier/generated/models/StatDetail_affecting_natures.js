const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}increase`,
                label: `[${labelPrefix}increase]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}increase${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}decrease`,
                label: `[${labelPrefix}decrease]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}decrease${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'increase': utils.childMapping(bundle.inputData?.[`${keyPrefix}increase`], `${keyPrefix}increase`, AbilityDetail_pokemon_inner_pokemon),
            'decrease': utils.childMapping(bundle.inputData?.[`${keyPrefix}decrease`], `${keyPrefix}decrease`, AbilityDetail_pokemon_inner_pokemon),
        }
    },
}
