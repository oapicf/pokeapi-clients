# PokeathlonStatDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**AffectingNatures** | [**PokeathlonStatAffectingNatures**](PokeathlonStatAffectingNatures.md) | A detail of natures which affect this Pokéathlon stat positively or negatively. | [readonly] 
**Names** | [**PokeathlonStatName[]**](PokeathlonStatName.md) | The name of this resource listed in different languages. | [readonly] 

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

