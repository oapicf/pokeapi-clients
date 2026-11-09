const utils = require('../utils/utils');
const LocationAreaPokemonEncounterVersion = require('../models/LocationAreaPokemonEncounterVersion');
const PokemonSummary = require('../models/PokemonSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...PokemonSummary.fields(`${keyPrefix}pokemon`, isInput),
            {
                key: `${keyPrefix}version_details`,
                label: `[${labelPrefix}version_details]`,
                children: LocationAreaPokemonEncounterVersion.fields(`${keyPrefix}version_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pokemon': utils.removeIfEmpty(PokemonSummary.mapping(bundle, `${keyPrefix}pokemon`)),
            'version_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_details`], `${keyPrefix}version_details`, LocationAreaPokemonEncounterVersion),
        }
    },
}
