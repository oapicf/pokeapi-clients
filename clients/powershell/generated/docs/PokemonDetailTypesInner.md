# PokemonDetailTypesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Slot** | **Int32** |  | 
**Type** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonDetailTypesInner = Initialize-PSOpenAPIToolsPokemonDetailTypesInner  -Slot null `
 -Type null
```

- Convert the resource to JSON
```powershell
$PokemonDetailTypesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

