const utils = require('../utils/utils');
const EvolutionConditionExpression = require('../models/EvolutionConditionExpression');
const EvolutionTriggerSummary = require('../models/EvolutionTriggerSummary');
const ItemSummary = require('../models/ItemSummary');
const LocationSummary = require('../models/LocationSummary');
const MoveSummary = require('../models/MoveSummary');
const NatureSummary = require('../models/NatureSummary');
const PokemonEvolution_known_move = require('../models/PokemonEvolution_known_move');
const PokemonFormSummary = require('../models/PokemonFormSummary');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');
const RegionSummary = require('../models/RegionSummary');
const TypeSummary = require('../models/TypeSummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
            {
                key: `${keyPrefix}is_default`,
                label: `Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. - [${labelPrefix}is_default]`,
                type: 'boolean',
            },
            ...ItemSummary.fields(`${keyPrefix}item`, isInput),
            ...EvolutionTriggerSummary.fields(`${keyPrefix}trigger`, isInput),
            {
                key: `${keyPrefix}gender`,
                label: `The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. - [${labelPrefix}gender]`,
                type: 'integer',
            },
            ...ItemSummary.fields(`${keyPrefix}held_item`, isInput),
            ...PokemonEvolution_known_move.fields(`${keyPrefix}known_move`, isInput),
            ...PokemonEvolution_known_move.fields(`${keyPrefix}known_move_type`, isInput),
            ...LocationSummary.fields(`${keyPrefix}location`, isInput),
            {
                key: `${keyPrefix}min_level`,
                label: `The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. - [${labelPrefix}min_level]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_happiness`,
                label: `The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. - [${labelPrefix}min_happiness]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_beauty`,
                label: `The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. - [${labelPrefix}min_beauty]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_affection`,
                label: `The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. - [${labelPrefix}min_affection]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}near_special_rock`,
                label: `Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. - [${labelPrefix}near_special_rock]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}needs_multiplayer`,
                label: `Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). - [${labelPrefix}needs_multiplayer]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}needs_overworld_rain`,
                label: `Whether or not it must be raining in the overworld to cause evolution this Pokémon species. - [${labelPrefix}needs_overworld_rain]`,
                type: 'boolean',
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}party_species`, isInput),
            ...TypeSummary.fields(`${keyPrefix}party_type`, isInput),
            {
                key: `${keyPrefix}relative_physical_stats`,
                label: `The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense. - [${labelPrefix}relative_physical_stats]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}time_of_day`,
                label: `The required time of day. Day or night. - [${labelPrefix}time_of_day]`,
                type: 'string',
            },
            ...PokemonSpeciesSummary.fields(`${keyPrefix}trade_species`, isInput),
            {
                key: `${keyPrefix}turn_upside_down`,
                label: `Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. - [${labelPrefix}turn_upside_down]`,
                type: 'boolean',
            },
            ...RegionSummary.fields(`${keyPrefix}region`, isInput),
            ...PokemonFormSummary.fields(`${keyPrefix}required_pokemon_form`, isInput),
            ...PokemonFormSummary.fields(`${keyPrefix}evolved_pokemon_form`, isInput),
            ...MoveSummary.fields(`${keyPrefix}used_move`, isInput),
            {
                key: `${keyPrefix}min_move_count`,
                label: `The minimum number of times a move must be used in order to evolve into this Pokémon species. - [${labelPrefix}min_move_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_steps`,
                label: `The minimum number of steps that must be taken in order to evolve into this Pokémon species. - [${labelPrefix}min_steps]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_damage_taken`,
                label: `The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. - [${labelPrefix}min_damage_taken]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}allowed_natures`,
                label: `[${labelPrefix}allowed_natures]`,
                children: NatureSummary.fields(`${keyPrefix}allowed_natures${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...EvolutionConditionExpression.fields(`${keyPrefix}condition_expression`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
            'is_default': bundle.inputData?.[`${keyPrefix}is_default`],
            'item': utils.removeIfEmpty(ItemSummary.mapping(bundle, `${keyPrefix}item`)),
            'trigger': utils.removeIfEmpty(EvolutionTriggerSummary.mapping(bundle, `${keyPrefix}trigger`)),
            'gender': bundle.inputData?.[`${keyPrefix}gender`],
            'held_item': utils.removeIfEmpty(ItemSummary.mapping(bundle, `${keyPrefix}held_item`)),
            'known_move': utils.removeIfEmpty(PokemonEvolution_known_move.mapping(bundle, `${keyPrefix}known_move`)),
            'known_move_type': utils.removeIfEmpty(PokemonEvolution_known_move.mapping(bundle, `${keyPrefix}known_move_type`)),
            'location': utils.removeIfEmpty(LocationSummary.mapping(bundle, `${keyPrefix}location`)),
            'min_level': bundle.inputData?.[`${keyPrefix}min_level`],
            'min_happiness': bundle.inputData?.[`${keyPrefix}min_happiness`],
            'min_beauty': bundle.inputData?.[`${keyPrefix}min_beauty`],
            'min_affection': bundle.inputData?.[`${keyPrefix}min_affection`],
            'near_special_rock': bundle.inputData?.[`${keyPrefix}near_special_rock`],
            'needs_multiplayer': bundle.inputData?.[`${keyPrefix}needs_multiplayer`],
            'needs_overworld_rain': bundle.inputData?.[`${keyPrefix}needs_overworld_rain`],
            'party_species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}party_species`)),
            'party_type': utils.removeIfEmpty(TypeSummary.mapping(bundle, `${keyPrefix}party_type`)),
            'relative_physical_stats': bundle.inputData?.[`${keyPrefix}relative_physical_stats`],
            'time_of_day': bundle.inputData?.[`${keyPrefix}time_of_day`],
            'trade_species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}trade_species`)),
            'turn_upside_down': bundle.inputData?.[`${keyPrefix}turn_upside_down`],
            'region': utils.removeIfEmpty(RegionSummary.mapping(bundle, `${keyPrefix}region`)),
            'required_pokemon_form': utils.removeIfEmpty(PokemonFormSummary.mapping(bundle, `${keyPrefix}required_pokemon_form`)),
            'evolved_pokemon_form': utils.removeIfEmpty(PokemonFormSummary.mapping(bundle, `${keyPrefix}evolved_pokemon_form`)),
            'used_move': utils.removeIfEmpty(MoveSummary.mapping(bundle, `${keyPrefix}used_move`)),
            'min_move_count': bundle.inputData?.[`${keyPrefix}min_move_count`],
            'min_steps': bundle.inputData?.[`${keyPrefix}min_steps`],
            'min_damage_taken': bundle.inputData?.[`${keyPrefix}min_damage_taken`],
            'allowed_natures': utils.childMapping(bundle.inputData?.[`${keyPrefix}allowed_natures`], `${keyPrefix}allowed_natures`, NatureSummary),
            'condition_expression': utils.removeIfEmpty(EvolutionConditionExpression.mapping(bundle, `${keyPrefix}condition_expression`)),
        }
    },
}
