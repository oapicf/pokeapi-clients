# PokeathlonStatAffectingNatures
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | [**PokeathlonStatAffectingNature[]**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. | 
**Decrease** | [**PokeathlonStatAffectingNature[]**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. | 

## Examples

- Prepare the resource
```powershell
$PokeathlonStatAffectingNatures = Initialize-PSOpenAPIToolsPokeathlonStatAffectingNatures  -Increase null `
 -Decrease null
```

- Convert the resource to JSON
```powershell
$PokeathlonStatAffectingNatures | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

