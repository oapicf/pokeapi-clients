const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender = require('../models/EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.fields(`${keyPrefix}gender`, isInput),
            ...EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.fields(`${keyPrefix}held_item`, isInput),
            ...EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.fields(`${keyPrefix}item`, isInput),
            {
                key: `${keyPrefix}known_move`,
                label: `[${labelPrefix}known_move]`,
                required: true,
                type: 'object',
            },
            {
                key: `${keyPrefix}known_move_type`,
                label: `[${labelPrefix}known_move_type]`,
                required: true,
                type: 'object',
            },
            ...EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.fields(`${keyPrefix}location`, isInput),
            {
                key: `${keyPrefix}min_affection`,
                label: `[${labelPrefix}min_affection]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_beauty`,
                label: `[${labelPrefix}min_beauty]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_happiness`,
                label: `[${labelPrefix}min_happiness]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_level`,
                label: `[${labelPrefix}min_level]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}needs_overworld_rain`,
                label: `[${labelPrefix}needs_overworld_rain]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}party_species`,
                label: `[${labelPrefix}party_species]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}party_type`,
                label: `[${labelPrefix}party_type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}relative_physical_stats`,
                label: `[${labelPrefix}relative_physical_stats]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}time_of_day`,
                label: `[${labelPrefix}time_of_day]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}trade_species`,
                label: `[${labelPrefix}trade_species]`,
                required: true,
                type: 'string',
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}trigger`, isInput),
            {
                key: `${keyPrefix}turn_upside_down`,
                label: `[${labelPrefix}turn_upside_down]`,
                required: true,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'gender': utils.removeIfEmpty(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.mapping(bundle, `${keyPrefix}gender`)),
            'held_item': utils.removeIfEmpty(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.mapping(bundle, `${keyPrefix}held_item`)),
            'item': utils.removeIfEmpty(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.mapping(bundle, `${keyPrefix}item`)),
            'known_move': bundle.inputData?.[`${keyPrefix}known_move`],
            'known_move_type': bundle.inputData?.[`${keyPrefix}known_move_type`],
            'location': utils.removeIfEmpty(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.mapping(bundle, `${keyPrefix}location`)),
            'min_affection': bundle.inputData?.[`${keyPrefix}min_affection`],
            'min_beauty': bundle.inputData?.[`${keyPrefix}min_beauty`],
            'min_happiness': bundle.inputData?.[`${keyPrefix}min_happiness`],
            'min_level': bundle.inputData?.[`${keyPrefix}min_level`],
            'needs_overworld_rain': bundle.inputData?.[`${keyPrefix}needs_overworld_rain`],
            'party_species': bundle.inputData?.[`${keyPrefix}party_species`],
            'party_type': bundle.inputData?.[`${keyPrefix}party_type`],
            'relative_physical_stats': bundle.inputData?.[`${keyPrefix}relative_physical_stats`],
            'time_of_day': bundle.inputData?.[`${keyPrefix}time_of_day`],
            'trade_species': bundle.inputData?.[`${keyPrefix}trade_species`],
            'trigger': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}trigger`)),
            'turn_upside_down': bundle.inputData?.[`${keyPrefix}turn_upside_down`],
        }
    },
}
