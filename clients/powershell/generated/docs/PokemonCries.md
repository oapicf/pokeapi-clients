# PokemonCries
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latest** | **String** | The latest depiction of this Pokémon&#39;s cry. | 
**Legacy** | **String** | The legacy depiction of this Pokémon&#39;s cry. | 

## Examples

- Prepare the resource
```powershell
$PokemonCries = Initialize-PSOpenAPIToolsPokemonCries  -Latest null `
 -Legacy null
```

- Convert the resource to JSON
```powershell
$PokemonCries | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

