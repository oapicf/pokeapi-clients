const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const PokemonDetail_abilities_inner = require('../models/PokemonDetail_abilities_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}abilities`,
                label: `[${labelPrefix}abilities]`,
                children: PokemonDetail_abilities_inner.fields(`${keyPrefix}abilities${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}generation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'abilities': utils.childMapping(bundle.inputData?.[`${keyPrefix}abilities`], `${keyPrefix}abilities`, PokemonDetail_abilities_inner),
            'generation': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}generation`)),
        }
    },
}
