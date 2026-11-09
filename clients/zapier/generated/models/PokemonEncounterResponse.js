const utils = require('../utils/utils');
const LocationAreaSummary = require('../models/LocationAreaSummary');
const PokemonEncounterVersionDetailResponse = require('../models/PokemonEncounterVersionDetailResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...LocationAreaSummary.fields(`${keyPrefix}location_area`, isInput),
            {
                key: `${keyPrefix}version_details`,
                label: `[${labelPrefix}version_details]`,
                children: PokemonEncounterVersionDetailResponse.fields(`${keyPrefix}version_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'location_area': utils.removeIfEmpty(LocationAreaSummary.mapping(bundle, `${keyPrefix}location_area`)),
            'version_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_details`], `${keyPrefix}version_details`, PokemonEncounterVersionDetailResponse),
        }
    },
}
