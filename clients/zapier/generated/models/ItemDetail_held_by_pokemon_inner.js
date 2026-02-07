const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const ItemDetail_held_by_pokemon_inner_version_details_inner = require('../models/ItemDetail_held_by_pokemon_inner_version_details_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokemon`, isInput),
            {
                key: `${keyPrefix}version-details`,
                label: `[${labelPrefix}versionMinusdetails]`,
                children: ItemDetail_held_by_pokemon_inner_version_details_inner.fields(`${keyPrefix}versionMinusdetails${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pokemon': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}pokemon`)),
            'version-details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version-details`], `${keyPrefix}version-details`, ItemDetail_held_by_pokemon_inner_version_details_inner),
        }
    },
}
