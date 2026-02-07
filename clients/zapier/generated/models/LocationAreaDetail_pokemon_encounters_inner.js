const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const LocationAreaDetail_pokemon_encounters_inner_version_details_inner = require('../models/LocationAreaDetail_pokemon_encounters_inner_version_details_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}pokemon`, isInput),
            {
                key: `${keyPrefix}version_details`,
                label: `[${labelPrefix}version_details]`,
                children: LocationAreaDetail_pokemon_encounters_inner_version_details_inner.fields(`${keyPrefix}version_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pokemon': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}pokemon`)),
            'version_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_details`], `${keyPrefix}version_details`, LocationAreaDetail_pokemon_encounters_inner_version_details_inner),
        }
    },
}
