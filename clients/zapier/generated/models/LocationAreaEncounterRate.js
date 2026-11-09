const utils = require('../utils/utils');
const EncounterMethodSummary = require('../models/EncounterMethodSummary');
const LocationAreaEncounterVersionDetail = require('../models/LocationAreaEncounterVersionDetail');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...EncounterMethodSummary.fields(`${keyPrefix}encounter_method`, isInput),
            {
                key: `${keyPrefix}version_details`,
                label: `[${labelPrefix}version_details]`,
                children: LocationAreaEncounterVersionDetail.fields(`${keyPrefix}version_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'encounter_method': utils.removeIfEmpty(EncounterMethodSummary.mapping(bundle, `${keyPrefix}encounter_method`)),
            'version_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_details`], `${keyPrefix}version_details`, LocationAreaEncounterVersionDetail),
        }
    },
}
