const utils = require('../utils/utils');
const LocationAreaEncounterRate = require('../models/LocationAreaEncounterRate');
const LocationAreaName = require('../models/LocationAreaName');
const LocationAreaPokemonEncounter = require('../models/LocationAreaPokemonEncounter');
const LocationSummary = require('../models/LocationSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier for this resource. - [${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name for this resource. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}game_index`,
                label: `The internal id of an API resource within game data. - [${labelPrefix}game_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}encounter_method_rates`,
                label: `[${labelPrefix}encounter_method_rates]`,
                children: LocationAreaEncounterRate.fields(`${keyPrefix}encounter_method_rates${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...LocationSummary.fields(`${keyPrefix}location`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: LocationAreaName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon_encounters`,
                label: `[${labelPrefix}pokemon_encounters]`,
                children: LocationAreaPokemonEncounter.fields(`${keyPrefix}pokemon_encounters${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'game_index': bundle.inputData?.[`${keyPrefix}game_index`],
            'encounter_method_rates': utils.childMapping(bundle.inputData?.[`${keyPrefix}encounter_method_rates`], `${keyPrefix}encounter_method_rates`, LocationAreaEncounterRate),
            'location': utils.removeIfEmpty(LocationSummary.mapping(bundle, `${keyPrefix}location`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, LocationAreaName),
            'pokemon_encounters': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_encounters`], `${keyPrefix}pokemon_encounters`, LocationAreaPokemonEncounter),
        }
    },
}
