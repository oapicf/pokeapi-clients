const utils = require('../utils/utils');
const pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner = require('../models/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner');
const pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method = require('../models/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}chance`,
                label: `[${labelPrefix}chance]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}condition_values`,
                label: `[${labelPrefix}condition_values]`,
                children: pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner.fields(`${keyPrefix}condition_values${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}max_level`,
                label: `[${labelPrefix}max_level]`,
                required: true,
                type: 'number',
            },
            ...pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method.fields(`${keyPrefix}method`, isInput),
            {
                key: `${keyPrefix}min_level`,
                label: `[${labelPrefix}min_level]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'chance': bundle.inputData?.[`${keyPrefix}chance`],
            'condition_values': utils.childMapping(bundle.inputData?.[`${keyPrefix}condition_values`], `${keyPrefix}condition_values`, pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner),
            'max_level': bundle.inputData?.[`${keyPrefix}max_level`],
            'method': utils.removeIfEmpty(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method.mapping(bundle, `${keyPrefix}method`)),
            'min_level': bundle.inputData?.[`${keyPrefix}min_level`],
        }
    },
}
