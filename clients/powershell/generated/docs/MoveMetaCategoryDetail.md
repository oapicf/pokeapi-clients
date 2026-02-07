# MoveMetaCategoryDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Descriptions** | [**MoveMetaCategoryDescription[]**](MoveMetaCategoryDescription.md) |  | 
**Moves** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveMetaCategoryDetail = Initialize-PSOpenAPIToolsMoveMetaCategoryDetail  -Id null `
 -Name null `
 -Descriptions null `
 -Moves null
```

- Convert the resource to JSON
```powershell
$MoveMetaCategoryDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

