# PokemonSpeciesDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **order** | **Integer** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] [default to null] |
| **gender\_rate** | **Integer** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] [default to null] |
| **capture\_rate** | **Integer** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] [default to null] |
| **base\_happiness** | **Integer** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] [default to null] |
| **is\_baby** | **Boolean** | Whether or not this is a baby Pokémon. | [optional] [default to null] |
| **is\_legendary** | **Boolean** | Whether or not this is a legendary Pokémon. | [optional] [default to null] |
| **is\_mythical** | **Boolean** | Whether or not this is a mythical Pokémon. | [optional] [default to null] |
| **hatch\_counter** | **Integer** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] [default to null] |
| **has\_gender\_differences** | **Boolean** | Whether or not this Pokémon has visual gender differences. | [optional] [default to null] |
| **forms\_switchable** | **Boolean** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] [default to null] |
| **growth\_rate** | [**GrowthRateSummary**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | [default to null] |
| **pokedex\_numbers** | [**List**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [default to null] |
| **egg\_groups** | [**List**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [default to null] |
| **color** | [**PokemonColorSummary**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | [default to null] |
| **shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | [default to null] |
| **evolves\_from\_species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | [default to null] |
| **evolution\_chain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | [default to null] |
| **habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | [default to null] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this Pokémon species was introduced in. | [default to null] |
| **names** | [**List**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [default to null] |
| **pal\_park\_encounters** | [**List**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [default to null] |
| **form\_descriptions** | [**List**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [default to null] |
| **flavor\_text\_entries** | [**List**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [default to null] |
| **genera** | [**List**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [default to null] |
| **varieties** | [**List**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

