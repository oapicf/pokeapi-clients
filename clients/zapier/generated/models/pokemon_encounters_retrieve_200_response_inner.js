const utils = require('../utils/utils');
const pokemon_encounters_retrieve_200_response_inner_location_area = require('../models/pokemon_encounters_retrieve_200_response_inner_location_area');
const pokemon_encounters_retrieve_200_response_inner_version_details_inner = require('../models/pokemon_encounters_retrieve_200_response_inner_version_details_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...pokemon_encounters_retrieve_200_response_inner_location_area.fields(`${keyPrefix}location_area`, isInput),
            {
                key: `${keyPrefix}version_details`,
                label: `[${labelPrefix}version_details]`,
                children: pokemon_encounters_retrieve_200_response_inner_version_details_inner.fields(`${keyPrefix}version_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'location_area': utils.removeIfEmpty(pokemon_encounters_retrieve_200_response_inner_location_area.mapping(bundle, `${keyPrefix}location_area`)),
            'version_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_details`], `${keyPrefix}version_details`, pokemon_encounters_retrieve_200_response_inner_version_details_inner),
        }
    },
}
