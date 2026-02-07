# VersionGroupDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Order** | **Int32** |  | [optional] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**MoveLearnMethods** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Pokedexes** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Regions** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Versions** | [**VersionSummary[]**](VersionSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$VersionGroupDetail = Initialize-PSOpenAPIToolsVersionGroupDetail  -Id null `
 -Name null `
 -Order null `
 -Generation null `
 -MoveLearnMethods null `
 -Pokedexes null `
 -Regions null `
 -Versions null
```

- Convert the resource to JSON
```powershell
$VersionGroupDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

