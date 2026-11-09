const utils = require('../utils/utils');
const LocationAreaEncounterDetail = require('../models/LocationAreaEncounterDetail');
const VersionSummary = require('../models/VersionSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...VersionSummary.fields(`${keyPrefix}version`, isInput),
            {
                key: `${keyPrefix}max_chance`,
                label: `The total percentage of all encounter potential. - [${labelPrefix}max_chance]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}encounter_details`,
                label: `[${labelPrefix}encounter_details]`,
                children: LocationAreaEncounterDetail.fields(`${keyPrefix}encounter_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'version': utils.removeIfEmpty(VersionSummary.mapping(bundle, `${keyPrefix}version`)),
            'max_chance': bundle.inputData?.[`${keyPrefix}max_chance`],
            'encounter_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}encounter_details`], `${keyPrefix}encounter_details`, LocationAreaEncounterDetail),
        }
    },
}
