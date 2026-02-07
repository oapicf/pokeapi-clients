# MoveLearnMethodDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Names** | [**MoveLearnMethodName[]**](MoveLearnMethodName.md) |  | 
**Descriptions** | [**MoveLearnMethodDescription[]**](MoveLearnMethodDescription.md) |  | 
**VersionGroups** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveLearnMethodDetail = Initialize-PSOpenAPIToolsMoveLearnMethodDetail  -Id null `
 -Name null `
 -Names null `
 -Descriptions null `
 -VersionGroups null
```

- Convert the resource to JSON
```powershell
$MoveLearnMethodDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

