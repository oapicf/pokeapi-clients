# PokemonDetailPastTypesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Generation** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Types** | [**PokemonDetailTypesInner[]**](PokemonDetailTypesInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonDetailPastTypesInner = Initialize-PSOpenAPIToolsPokemonDetailPastTypesInner  -Generation null `
 -Types null
```

- Convert the resource to JSON
```powershell
$PokemonDetailPastTypesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

