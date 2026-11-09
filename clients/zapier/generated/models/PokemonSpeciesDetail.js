const utils = require('../utils/utils');
const EggGroupSummary = require('../models/EggGroupSummary');
const EvolutionChainSummary = require('../models/EvolutionChainSummary');
const GenerationSummary = require('../models/GenerationSummary');
const GrowthRateSummary = require('../models/GrowthRateSummary');
const PokemonColorSummary = require('../models/PokemonColorSummary');
const PokemonDexEntry = require('../models/PokemonDexEntry');
const PokemonHabitatSummary = require('../models/PokemonHabitatSummary');
const PokemonShapeSummary = require('../models/PokemonShapeSummary');
const PokemonSpeciesDescription = require('../models/PokemonSpeciesDescription');
const PokemonSpeciesFlavorText = require('../models/PokemonSpeciesFlavorText');
const PokemonSpeciesGenus = require('../models/PokemonSpeciesGenus');
const PokemonSpeciesName = require('../models/PokemonSpeciesName');
const PokemonSpeciesPalParkEncounter = require('../models/PokemonSpeciesPalParkEncounter');
const PokemonSpeciesSummary = require('../models/PokemonSpeciesSummary');
const PokemonSpeciesVariety = require('../models/PokemonSpeciesVariety');

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
                key: `${keyPrefix}order`,
                label: `The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. - [${labelPrefix}order]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}gender_rate`,
                label: `The chance of this Pokémon being female, in eighths; or -1 for genderless. - [${labelPrefix}gender_rate]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}capture_rate`,
                label: `The base capture rate; up to 255. The higher the number, the easier the catch. - [${labelPrefix}capture_rate]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}base_happiness`,
                label: `The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. - [${labelPrefix}base_happiness]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_baby`,
                label: `Whether or not this is a baby Pokémon. - [${labelPrefix}is_baby]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_legendary`,
                label: `Whether or not this is a legendary Pokémon. - [${labelPrefix}is_legendary]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_mythical`,
                label: `Whether or not this is a mythical Pokémon. - [${labelPrefix}is_mythical]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}hatch_counter`,
                label: `Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. - [${labelPrefix}hatch_counter]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}has_gender_differences`,
                label: `Whether or not this Pokémon has visual gender differences. - [${labelPrefix}has_gender_differences]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}forms_switchable`,
                label: `Whether or not this Pokémon has multiple forms and can switch between them. - [${labelPrefix}forms_switchable]`,
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
                children: EggGroupSummary.fields(`${keyPrefix}egg_groups${!isInput ? '[]' : ''}`, isInput, true), 
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
                children: PokemonSpeciesName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pal_park_encounters`,
                label: `[${labelPrefix}pal_park_encounters]`,
                children: PokemonSpeciesPalParkEncounter.fields(`${keyPrefix}pal_park_encounters${!isInput ? '[]' : ''}`, isInput, true), 
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
                children: PokemonSpeciesGenus.fields(`${keyPrefix}genera${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}varieties`,
                label: `[${labelPrefix}varieties]`,
                children: PokemonSpeciesVariety.fields(`${keyPrefix}varieties${!isInput ? '[]' : ''}`, isInput, true), 
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
            'egg_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}egg_groups`], `${keyPrefix}egg_groups`, EggGroupSummary),
            'color': utils.removeIfEmpty(PokemonColorSummary.mapping(bundle, `${keyPrefix}color`)),
            'shape': utils.removeIfEmpty(PokemonShapeSummary.mapping(bundle, `${keyPrefix}shape`)),
            'evolves_from_species': utils.removeIfEmpty(PokemonSpeciesSummary.mapping(bundle, `${keyPrefix}evolves_from_species`)),
            'evolution_chain': utils.removeIfEmpty(EvolutionChainSummary.mapping(bundle, `${keyPrefix}evolution_chain`)),
            'habitat': utils.removeIfEmpty(PokemonHabitatSummary.mapping(bundle, `${keyPrefix}habitat`)),
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokemonSpeciesName),
            'pal_park_encounters': utils.childMapping(bundle.inputData?.[`${keyPrefix}pal_park_encounters`], `${keyPrefix}pal_park_encounters`, PokemonSpeciesPalParkEncounter),
            'form_descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}form_descriptions`], `${keyPrefix}form_descriptions`, PokemonSpeciesDescription),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, PokemonSpeciesFlavorText),
            'genera': utils.childMapping(bundle.inputData?.[`${keyPrefix}genera`], `${keyPrefix}genera`, PokemonSpeciesGenus),
            'varieties': utils.childMapping(bundle.inputData?.[`${keyPrefix}varieties`], `${keyPrefix}varieties`, PokemonSpeciesVariety),
        }
    },
}
