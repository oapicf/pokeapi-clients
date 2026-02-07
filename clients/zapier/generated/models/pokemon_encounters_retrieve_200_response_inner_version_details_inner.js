const utils = require('../utils/utils');
const pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner = require('../models/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner');
const pokemon_encounters_retrieve_200_response_inner_version_details_inner_version = require('../models/pokemon_encounters_retrieve_200_response_inner_version_details_inner_version');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}encounter_details`,
                label: `[${labelPrefix}encounter_details]`,
                children: pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.fields(`${keyPrefix}encounter_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}max_chance`,
                label: `[${labelPrefix}max_chance]`,
                required: true,
                type: 'number',
            },
            ...pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.fields(`${keyPrefix}version`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'encounter_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}encounter_details`], `${keyPrefix}encounter_details`, pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner),
            'max_chance': bundle.inputData?.[`${keyPrefix}max_chance`],
            'version': utils.removeIfEmpty(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.mapping(bundle, `${keyPrefix}version`)),
        }
    },
}
