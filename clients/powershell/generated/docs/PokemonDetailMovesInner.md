# PokemonDetailMovesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Move** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionGroupDetails** | [**PokemonDetailMovesInnerVersionGroupDetailsInner[]**](PokemonDetailMovesInnerVersionGroupDetailsInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonDetailMovesInner = Initialize-PSOpenAPIToolsPokemonDetailMovesInner  -Move null `
 -VersionGroupDetails null
```

- Convert the resource to JSON
```powershell
$PokemonDetailMovesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

