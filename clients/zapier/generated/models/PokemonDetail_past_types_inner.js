const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const PokemonDetail_types_inner = require('../models/PokemonDetail_types_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}generation`, isInput),
            {
                key: `${keyPrefix}types`,
                label: `[${labelPrefix}types]`,
                children: PokemonDetail_types_inner.fields(`${keyPrefix}types${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'generation': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}generation`)),
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, PokemonDetail_types_inner),
        }
    },
}
