# PokeathlonStatDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**AffectingNatures** | [**PokeathlonStatDetailAffectingNatures**](PokeathlonStatDetailAffectingNatures.md) |  | 
**Names** | [**PokeathlonStatName[]**](PokeathlonStatName.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokeathlonStatDetail = Initialize-PSOpenAPIToolsPokeathlonStatDetail  -Id null `
 -Name null `
 -AffectingNatures null `
 -Names null
```

- Convert the resource to JSON
```powershell
$PokeathlonStatDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

