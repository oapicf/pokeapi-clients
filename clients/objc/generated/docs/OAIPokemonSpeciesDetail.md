# OAIPokemonSpeciesDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**order** | **NSNumber*** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] 
**genderRate** | **NSNumber*** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] 
**captureRate** | **NSNumber*** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] 
**baseHappiness** | **NSNumber*** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] 
**isBaby** | **NSNumber*** | Whether or not this is a baby Pokémon. | [optional] 
**isLegendary** | **NSNumber*** | Whether or not this is a legendary Pokémon. | [optional] 
**isMythical** | **NSNumber*** | Whether or not this is a mythical Pokémon. | [optional] 
**hatchCounter** | **NSNumber*** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] 
**hasGenderDifferences** | **NSNumber*** | Whether or not this Pokémon has visual gender differences. | [optional] 
**formsSwitchable** | **NSNumber*** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] 
**growthRate** | [**OAIGrowthRateSummary***](OAIGrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | 
**pokedexNumbers** | [**NSArray&lt;OAIPokemonDexEntry&gt;***](OAIPokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly] 
**eggGroups** | [**NSArray&lt;OAIEggGroupSummary&gt;***](OAIEggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly] 
**color** | [**OAIPokemonColorSummary***](OAIPokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | 
**shape** | [**OAIPokemonShapeSummary***](OAIPokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | 
**evolvesFromSpecies** | [**OAIPokemonSpeciesSummary***](OAIPokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | 
**evolutionChain** | [**OAIEvolutionChainSummary***](OAIEvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | 
**habitat** | [**OAIPokemonHabitatSummary***](OAIPokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | 
**generation** | [**OAIGenerationSummary***](OAIGenerationSummary.md) | The generation this Pokémon species was introduced in. | 
**names** | [**NSArray&lt;OAIPokemonSpeciesName&gt;***](OAIPokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly] 
**palParkEncounters** | [**NSArray&lt;OAIPokemonSpeciesPalParkEncounter&gt;***](OAIPokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly] 
**formDescriptions** | [**NSArray&lt;OAIPokemonSpeciesDescription&gt;***](OAIPokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly] 
**flavorTextEntries** | [**NSArray&lt;OAIPokemonSpeciesFlavorText&gt;***](OAIPokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly] 
**genera** | [**NSArray&lt;OAIPokemonSpeciesGenus&gt;***](OAIPokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly] 
**varieties** | [**NSArray&lt;OAIPokemonSpeciesVariety&gt;***](OAIPokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


