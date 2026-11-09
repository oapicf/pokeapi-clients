# PokeathlonStatAffectingNature
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxChange** | **Int32** | The maximum amount of change to the referenced Pokéathlon stat. | 
**Nature** | [**NatureSummary**](NatureSummary.md) | The nature causing the change. | 

## Examples

- Prepare the resource
```powershell
$PokeathlonStatAffectingNature = Initialize-PSOpenAPIToolsPokeathlonStatAffectingNature  -MaxChange null `
 -Nature null
```

- Convert the resource to JSON
```powershell
$PokeathlonStatAffectingNature | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

