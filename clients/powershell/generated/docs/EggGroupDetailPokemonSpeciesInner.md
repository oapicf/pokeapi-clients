# EggGroupDetailPokemonSpeciesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Pokemon species name. | [optional] 
**Url** | **String** | The URL to get more information about the species | [optional] 

## Examples

- Prepare the resource
```powershell
$EggGroupDetailPokemonSpeciesInner = Initialize-PSOpenAPIToolsEggGroupDetailPokemonSpeciesInner  -Name null `
 -Url null
```

- Convert the resource to JSON
```powershell
$EggGroupDetailPokemonSpeciesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

