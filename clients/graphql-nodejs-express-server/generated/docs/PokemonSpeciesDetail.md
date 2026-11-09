# PokemonSpeciesDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**order** | **Int** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] [default to null]
**genderRate** | **Int** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] [default to null]
**captureRate** | **Int** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] [default to null]
**baseHappiness** | **Int** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] [default to null]
**isBaby** | **Boolean!** | Whether or not this is a baby Pokémon. | [optional] [default to null]
**isLegendary** | **Boolean!** | Whether or not this is a legendary Pokémon. | [optional] [default to null]
**isMythical** | **Boolean!** | Whether or not this is a mythical Pokémon. | [optional] [default to null]
**hatchCounter** | **Int** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] [default to null]
**hasGenderDifferences** | **Boolean!** | Whether or not this Pokémon has visual gender differences. | [optional] [default to null]
**formsSwitchable** | **Boolean!** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] [default to null]
**growthRate** | [***GrowthRateSummary**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | [default to null]
**pokedexNumbers** | [**PokemonDexEntry**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly] [default to null]
**eggGroups** | [**EggGroupSummary**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly] [default to null]
**color** | [***PokemonColorSummary**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | [default to null]
**shape** | [***PokemonShapeSummary**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | [default to null]
**evolvesFromSpecies** | [***PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | [default to null]
**evolutionChain** | [***EvolutionChainSummary**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | [default to null]
**habitat** | [***PokemonHabitatSummary**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | [default to null]
**generation** | [***GenerationSummary**](GenerationSummary.md) | The generation this Pokémon species was introduced in. | [default to null]
**names** | [**PokemonSpeciesName**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**palParkEncounters** | [**PokemonSpeciesPalParkEncounter**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly] [default to null]
**formDescriptions** | [**PokemonSpeciesDescription**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly] [default to null]
**flavorTextEntries** | [**PokemonSpeciesFlavorText**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly] [default to null]
**genera** | [**PokemonSpeciesGenus**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly] [default to null]
**varieties** | [**PokemonSpeciesVariety**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


