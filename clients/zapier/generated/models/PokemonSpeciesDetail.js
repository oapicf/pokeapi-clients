const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const EvolutionChainSummary = require('../models/EvolutionChainSummary');
const GenerationSummary = require('../models/GenerationSummary');
const GrowthRateSummary = require('../models/GrowthRateSummary');
const PokemonColorSummary = require('../models/PokemonColorSummary');
const PokemonDexEntry = require('../models/PokemonDexEntry');
const PokemonFormDetail_form_names_inner = require('../models/PokemonFormDetail_form_names_inner');
const PokemonHabitatSummary = require('../models/PokemonHabitatSummary');
const PokemonShapeSummary = require('../models/PokemonShapeSummary');
const PokemonSpeciesDescription = require('../models/PokemonSpeciesDescription');
const PokemonSpeciesDetail_genera_inner = require('../models/PokemonSpeciesDetail_genera_inner');
const PokemonSpeciesDetail_pal_park_encounters_inner = require('../models/PokemonSpeciesDetail_pal_park_encounters_inner');
const PokemonSpeciesDetail_varieties_inner = require('../models/PokemonSpeciesDetail_varieties_inner');
const PokemonSpeciesFlavorText = require('../models/PokemonSpeciesFlavorText');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}order`,
                label: `[${labelPrefix}order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}gender_rate`,
                label: `[${labelPrefix}gender_rate]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}capture_rate`,
                label: `[${labelPrefix}capture_rate]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}base_happiness`,
                label: `[${labelPrefix}base_happiness]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_baby`,
                label: `[${labelPrefix}is_baby]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_legendary`,
                label: `[${labelPrefix}is_legendary]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_mythical`,
                label: `[${labelPrefix}is_mythical]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}hatch_counter`,
                label: `[${labelPrefix}hatch_counter]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}has_gender_differences`,
                label: `[${labelPrefix}has_gender_differences]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}forms_switchable`,
                label: `[${labelPrefix}forms_switchable]`,
                type: 'boolean',
            },
            ...GrowthRateSummary.fields(`${keyPrefix}growth_rate`, isInput),
            {
                key: `${keyPrefix}pokedex_numbers`,
                label: `[${labelPrefix}pokedex_numbers]`,
                children: PokemonDexEntry.fields(`${keyPrefix}pokedex_numbers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}egg_groups`,
                label: `[${labelPrefix}egg_groups]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}egg_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...PokemonColorSummary.fields(`${keyPrefix}color`, isInput),
            ...PokemonShapeSummary.fields(`${keyPrefix}shape`, isInput),
            ...PokemonSpeciesSummary.fields(`${keyPrefix}evolves_from_species`, isInput),
            ...EvolutionChainSummary.fields(`${keyPrefix}evolution_chain`, isInput),
            ...PokemonHabitatSummary.fields(`${keyPrefix}habitat`, isInput),
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokemonFormDetail_form_names_inner.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pal_park_encounters`,
                label: `[${labelPrefix}pal_park_encounters]`,
                children: PokemonSpeciesDetail_pal_park_encounters_inner.fields(`${keyPrefix}pal_park_encounters${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}form_descriptions`,
                label: `[${labelPrefix}form_descriptions]`,
                children: PokemonSpeciesDescription.fields(`${keyPrefix}form_descriptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: PokemonSpeciesFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}genera`,
                label: `[${labelPrefix}genera]`,
                children: PokemonSpeciesDetail_genera_inner.fields(`${keyPrefix}genera${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}varieties`,
                label: `[${labelPrefix}varieties]`,
                children: PokemonSpeciesDetail_varieties_inner.fields(`${keyPrefix}varieties${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'order': bundle.inputData?.[`${keyPrefix}order`],
            'gender_rate': bundle.inputData?.[`${keyPrefix}gender_rate`],
            'capture_rate': bundle.inputData?.[`${keyPrefix}capture_rate`],
            'base_happiness': bundle.inputData?.[`${keyPrefix}base_happiness`],
            'is_baby': bundle.inputData?.[`${keyPrefix}is_baby`],
            'is_legendary': bundle.inputData?.[`${keyPrefix}is_legendary`],
            'is_mythical': bundle.inputData?.[`${keyPrefix}is_mythical`],
            'hatch_counter': bundle.inputData?.[`${keyPrefix}hatch_counter`],
            'has_gender_differences': bundle.inputData?.[`${keyPrefix}has_gender_differences`],
            'forms_switchable': bundle.inputData?.[`${keyPrefix}forms_switchable`],
            'growth_rate': utils.removeIfEmpty(GrowthRateSummary.mapping(bundle, `${keyPrefix}growth_rate`)),
            'pokedex_numbers': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokedex_numbers`], `${keyPrefix}pokedex_numbers`, PokemonDexEntry),
            'egg_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}egg_groups`], `${keyPrefix}egg_groups`, AbilityDetail_pokemon_inner_pokemon),
            'color': utils.removeIfEmpty(PokemonColorSummary.mapping(bundle, `${keyPrefix}color`)),
            'shape': utils.removeIfEmpty(PokemonShapeSummary.mapping(bundle, `${keyPrefix}shape`)),
            'evolves_from_species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}evolves_from_species`)),
            'evolution_chain': utils.removeIfEmpty(EvolutionChainSummary.mapping(bundle, `${keyPrefix}evolution_chain`)),
            'habitat': utils.removeIfEmpty(PokemonHabitatSummary.mapping(bundle, `${keyPrefix}habitat`)),
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokemonFormDetail_form_names_inner),
            'pal_park_encounters': utils.childMapping(bundle.inputData?.[`${keyPrefix}pal_park_encounters`], `${keyPrefix}pal_park_encounters`, PokemonSpeciesDetail_pal_park_encounters_inner),
            'form_descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}form_descriptions`], `${keyPrefix}form_descriptions`, PokemonSpeciesDescription),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, PokemonSpeciesFlavorText),
            'genera': utils.childMapping(bundle.inputData?.[`${keyPrefix}genera`], `${keyPrefix}genera`, PokemonSpeciesDetail_genera_inner),
            'varieties': utils.childMapping(bundle.inputData?.[`${keyPrefix}varieties`], `${keyPrefix}varieties`, PokemonSpeciesDetail_varieties_inner),
        }
    },
}
