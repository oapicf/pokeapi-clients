# MoveChangeEffectEntriesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Effect** | **String** |  | 
**ShortEffect** | **String** |  | 
**Language** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveChangeEffectEntriesInner = Initialize-PSOpenAPIToolsMoveChangeEffectEntriesInner  -Effect null `
 -ShortEffect null `
 -Language null
```

- Convert the resource to JSON
```powershell
$MoveChangeEffectEntriesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

