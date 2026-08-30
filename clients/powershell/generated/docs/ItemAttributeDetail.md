# ItemAttributeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Descriptions** | [**ItemAttributeDescription[]**](ItemAttributeDescription.md) |  | [readonly] 
**Items** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] 
**Names** | [**ItemAttributeName[]**](ItemAttributeName.md) |  | [readonly] 

## Examples

- Prepare the resource
```powershell
$ItemAttributeDetail = Initialize-PSOpenAPIToolsItemAttributeDetail  -Id null `
 -Name null `
 -Descriptions null `
 -Items null `
 -Names null
```

- Convert the resource to JSON
```powershell
$ItemAttributeDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

