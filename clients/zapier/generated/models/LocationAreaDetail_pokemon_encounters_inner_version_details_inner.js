const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details = require('../models/LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}version`, isInput),
            {
                key: `${keyPrefix}max_chance`,
                label: `[${labelPrefix}max_chance]`,
                required: true,
                type: 'integer',
            },
            ...LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.fields(`${keyPrefix}encounter_details`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'version': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}version`)),
            'max_chance': bundle.inputData?.[`${keyPrefix}max_chance`],
            'encounter_details': utils.removeIfEmpty(LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.mapping(bundle, `${keyPrefix}encounter_details`)),
        }
    },
}
