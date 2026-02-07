# MoveMetaAilmentDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Moves** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Names** | [**MoveMetaAilmentName[]**](MoveMetaAilmentName.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveMetaAilmentDetail = Initialize-PSOpenAPIToolsMoveMetaAilmentDetail  -Id null `
 -Name null `
 -Moves null `
 -Names null
```

- Convert the resource to JSON
```powershell
$MoveMetaAilmentDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

