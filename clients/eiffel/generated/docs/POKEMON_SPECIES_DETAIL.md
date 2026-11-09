# POKEMON_SPECIES_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**order** | **INTEGER_32** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] [default to null]
**gender_rate** | **INTEGER_32** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] [default to null]
**capture_rate** | **INTEGER_32** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] [default to null]
**base_happiness** | **INTEGER_32** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] [default to null]
**is_baby** | **BOOLEAN** | Whether or not this is a baby Pokémon. | [optional] [default to null]
**is_legendary** | **BOOLEAN** | Whether or not this is a legendary Pokémon. | [optional] [default to null]
**is_mythical** | **BOOLEAN** | Whether or not this is a mythical Pokémon. | [optional] [default to null]
**hatch_counter** | **INTEGER_32** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] [default to null]
**has_gender_differences** | **BOOLEAN** | Whether or not this Pokémon has visual gender differences. | [optional] [default to null]
**forms_switchable** | **BOOLEAN** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] [default to null]
**growth_rate** | [**GROWTH_RATE_SUMMARY**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | [default to null]
**pokedex_numbers** | [**LIST [POKEMON_DEX_ENTRY]**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly] [default to null]
**egg_groups** | [**LIST [EGG_GROUP_SUMMARY]**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly] [default to null]
**color** | [**POKEMON_COLOR_SUMMARY**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | [default to null]
**shape** | [**POKEMON_SHAPE_SUMMARY**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | [default to null]
**evolves_from_species** | [**POKEMON_SPECIES_SUMMARY**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | [default to null]
**evolution_chain** | [**EVOLUTION_CHAIN_SUMMARY**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | [default to null]
**habitat** | [**POKEMON_HABITAT_SUMMARY**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | [default to null]
**generation** | [**GENERATION_SUMMARY**](GenerationSummary.md) | The generation this Pokémon species was introduced in. | [default to null]
**names** | [**LIST [POKEMON_SPECIES_NAME]**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pal_park_encounters** | [**LIST [POKEMON_SPECIES_PAL_PARK_ENCOUNTER]**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly] [default to null]
**form_descriptions** | [**LIST [POKEMON_SPECIES_DESCRIPTION]**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly] [default to null]
**flavor_text_entries** | [**LIST [POKEMON_SPECIES_FLAVOR_TEXT]**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly] [default to null]
**genera** | [**LIST [POKEMON_SPECIES_GENUS]**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly] [default to null]
**varieties** | [**LIST [POKEMON_SPECIES_VARIETY]**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


