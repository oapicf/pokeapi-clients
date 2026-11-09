# PokemonSpeciesDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Order** | **Int32** | The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. | [optional] 
**GenderRate** | **Int32** | The chance of this Pokémon being female, in eighths; or -1 for genderless. | [optional] 
**CaptureRate** | **Int32** | The base capture rate; up to 255. The higher the number, the easier the catch. | [optional] 
**BaseHappiness** | **Int32** | The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. | [optional] 
**IsBaby** | **Boolean** | Whether or not this is a baby Pokémon. | [optional] 
**IsLegendary** | **Boolean** | Whether or not this is a legendary Pokémon. | [optional] 
**IsMythical** | **Boolean** | Whether or not this is a mythical Pokémon. | [optional] 
**HatchCounter** | **Int32** | Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. | [optional] 
**HasGenderDifferences** | **Boolean** | Whether or not this Pokémon has visual gender differences. | [optional] 
**FormsSwitchable** | **Boolean** | Whether or not this Pokémon has multiple forms and can switch between them. | [optional] 
**GrowthRate** | [**GrowthRateSummary**](GrowthRateSummary.md) | The rate at which this Pokémon species gains levels. | 
**PokedexNumbers** | [**PokemonDexEntry[]**](PokemonDexEntry.md) | A list of Pokedexes and the indexes reserved within them for this Pokémon species. | [readonly] 
**EggGroups** | [**EggGroupSummary[]**](EggGroupSummary.md) | A list of egg groups this Pokémon species is a member of. | [readonly] 
**Color** | [**PokemonColorSummary**](PokemonColorSummary.md) | The color of this Pokémon for Pokédex search. | 
**Shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) | The shape of this Pokémon for Pokédex search. | 
**EvolvesFromSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species that evolves into this Pokemon_species. | 
**EvolutionChain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | The evolution chain this Pokémon species is a member of. | 
**Habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) | The habitat this Pokémon species can be encountered in. | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this Pokémon species was introduced in. | 
**Names** | [**PokemonSpeciesName[]**](PokemonSpeciesName.md) | The name of this resource listed in different languages. | [readonly] 
**PalParkEncounters** | [**PokemonSpeciesPalParkEncounter[]**](PokemonSpeciesPalParkEncounter.md) | A list of encounters that can be had with this Pokémon species in pal park. | [readonly] 
**FormDescriptions** | [**PokemonSpeciesDescription[]**](PokemonSpeciesDescription.md) | Descriptions of different forms Pokémon take on within the Pokémon species. | [readonly] 
**FlavorTextEntries** | [**PokemonSpeciesFlavorText[]**](PokemonSpeciesFlavorText.md) | A list of flavor text entries for this Pokémon species. | [readonly] 
**Genera** | [**PokemonSpeciesGenus[]**](PokemonSpeciesGenus.md) | The genus of this Pokémon species listed in multiple languages. | [readonly] 
**Varieties** | [**PokemonSpeciesVariety[]**](PokemonSpeciesVariety.md) | A list of the Pokémon that exist within this Pokémon species. | [readonly] 

## Examples

- Prepare the resource
```powershell
$PokemonSpeciesDetail = Initialize-PSOpenAPIToolsPokemonSpeciesDetail  -Id null `
 -Name null `
 -Order null `
 -GenderRate null `
 -CaptureRate null `
 -BaseHappiness null `
 -IsBaby null `
 -IsLegendary null `
 -IsMythical null `
 -HatchCounter null `
 -HasGenderDifferences null `
 -FormsSwitchable null `
 -GrowthRate null `
 -PokedexNumbers null `
 -EggGroups null `
 -Color null `
 -Shape null `
 -EvolvesFromSpecies null `
 -EvolutionChain null `
 -Habitat null `
 -Generation null `
 -Names null `
 -PalParkEncounters null `
 -FormDescriptions null `
 -FlavorTextEntries null `
 -Genera null `
 -Varieties null
```

- Convert the resource to JSON
```powershell
$PokemonSpeciesDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

