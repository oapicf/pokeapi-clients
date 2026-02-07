const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const PokemonDetail_moves_inner_version_group_details_inner = require('../models/PokemonDetail_moves_inner_version_group_details_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}move`, isInput),
            {
                key: `${keyPrefix}version_group_details`,
                label: `[${labelPrefix}version_group_details]`,
                children: PokemonDetail_moves_inner_version_group_details_inner.fields(`${keyPrefix}version_group_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'move': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}move`)),
            'version_group_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_group_details`], `${keyPrefix}version_group_details`, PokemonDetail_moves_inner_version_group_details_inner),
        }
    },
}
