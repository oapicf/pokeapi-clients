# PokemonSpeciesDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Order** | **Int32** |  | [optional] 
**GenderRate** | **Int32** |  | [optional] 
**CaptureRate** | **Int32** |  | [optional] 
**BaseHappiness** | **Int32** |  | [optional] 
**IsBaby** | **Boolean** |  | [optional] 
**IsLegendary** | **Boolean** |  | [optional] 
**IsMythical** | **Boolean** |  | [optional] 
**HatchCounter** | **Int32** |  | [optional] 
**HasGenderDifferences** | **Boolean** |  | [optional] 
**FormsSwitchable** | **Boolean** |  | [optional] 
**GrowthRate** | [**GrowthRateSummary**](GrowthRateSummary.md) |  | 
**PokedexNumbers** | [**PokemonDexEntry[]**](PokemonDexEntry.md) |  | 
**EggGroups** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Color** | [**PokemonColorSummary**](PokemonColorSummary.md) |  | 
**Shape** | [**PokemonShapeSummary**](PokemonShapeSummary.md) |  | 
**EvolvesFromSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) |  | 
**EvolutionChain** | [**EvolutionChainSummary**](EvolutionChainSummary.md) |  | 
**Habitat** | [**PokemonHabitatSummary**](PokemonHabitatSummary.md) |  | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**Names** | [**PokemonFormDetailFormNamesInner[]**](PokemonFormDetailFormNamesInner.md) |  | 
**PalParkEncounters** | [**PokemonSpeciesDetailPalParkEncountersInner[]**](PokemonSpeciesDetailPalParkEncountersInner.md) |  | 
**FormDescriptions** | [**PokemonSpeciesDescription[]**](PokemonSpeciesDescription.md) |  | 
**FlavorTextEntries** | [**PokemonSpeciesFlavorText[]**](PokemonSpeciesFlavorText.md) |  | 
**Genera** | [**PokemonSpeciesDetailGeneraInner[]**](PokemonSpeciesDetailGeneraInner.md) |  | 
**Varieties** | [**PokemonSpeciesDetailVarietiesInner[]**](PokemonSpeciesDetailVarietiesInner.md) |  | 

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

