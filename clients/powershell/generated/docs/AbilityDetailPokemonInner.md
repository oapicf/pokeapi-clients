# AbilityDetailPokemonInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsHidden** | **Boolean** |  | 
**Slot** | **Int32** |  | 
**Pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$AbilityDetailPokemonInner = Initialize-PSOpenAPIToolsAbilityDetailPokemonInner  -IsHidden null `
 -Slot null `
 -Pokemon null
```

- Convert the resource to JSON
```powershell
$AbilityDetailPokemonInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

