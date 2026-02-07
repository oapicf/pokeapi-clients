# MoveDetailStatChangesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Change** | **Int32** |  | 
**Stat** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveDetailStatChangesInner = Initialize-PSOpenAPIToolsMoveDetailStatChangesInner  -Change null `
 -Stat null
```

- Convert the resource to JSON
```powershell
$MoveDetailStatChangesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

