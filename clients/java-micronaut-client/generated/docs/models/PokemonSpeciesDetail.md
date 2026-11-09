

# PokemonSpeciesDetail

The class is defined in **[PokemonSpeciesDetail.java](../../src/main/java/org/openapitools/model/PokemonSpeciesDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**order** | `Integer` | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. |  [optional property]
**genderRate** | `Integer` | The chance of this Pokémon being female, in eighths; or -1 for genderless. |  [optional property]
**captureRate** | `Integer` | The base capture rate; up to 255. The higher the number, the easier the catch. |  [optional property]
**baseHappiness** | `Integer` | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. |  [optional property]
**isBaby** | `Boolean` | Whether or not this is a baby Pokémon. |  [optional property]
**isLegendary** | `Boolean` | Whether or not this is a legendary Pokémon. |  [optional property]
**isMythical** | `Boolean` | Whether or not this is a mythical Pokémon. |  [optional property]
**hatchCounter** | `Integer` | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. |  [optional property]
**hasGenderDifferences** | `Boolean` | Whether or not this Pokémon has visual gender differences. |  [optional property]
**formsSwitchable** | `Boolean` | Whether or not this Pokémon has multiple forms and can switch between them. |  [optional property]
**growthRate** | [`GrowthRateSummary`](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | 
**pokedexNumbers** | [`List&lt;PokemonDexEntry&gt;`](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. |  [readonly property]
**eggGroups** | [`List&lt;EggGroupSummary&gt;`](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. |  [readonly property]
**color** | [`PokemonColorSummary`](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | 
**shape** | [`PokemonShapeSummary`](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | 
**evolvesFromSpecies** | [`PokemonSpeciesSummary`](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | 
**evolutionChain** | [`EvolutionChainSummary`](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | 
**habitat** | [`PokemonHabitatSummary`](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | 
**generation** | [`GenerationSummary`](GenerationSummary.md) | The generation this Pokémon species was introduced in. | 
**names** | [`List&lt;PokemonSpeciesName&gt;`](PokemonSpeciesName.md) | The name of this resource listed in different languages. |  [readonly property]
**palParkEncounters** | [`List&lt;PokemonSpeciesPalParkEncounter&gt;`](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. |  [readonly property]
**formDescriptions** | [`List&lt;PokemonSpeciesDescription&gt;`](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. |  [readonly property]
**flavorTextEntries** | [`List&lt;PokemonSpeciesFlavorText&gt;`](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. |  [readonly property]
**genera** | [`List&lt;PokemonSpeciesGenus&gt;`](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. |  [readonly property]
**varieties** | [`List&lt;PokemonSpeciesVariety&gt;`](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. |  [readonly property]





























