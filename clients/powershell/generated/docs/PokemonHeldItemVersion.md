# PokemonHeldItemVersion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rarity** | **Int32** | How often the item is held. | 
**Version** | [**VersionSummary**](VersionSummary.md) | The version in which the item is held. | 

## Examples

- Prepare the resource
```powershell
$PokemonHeldItemVersion = Initialize-PSOpenAPIToolsPokemonHeldItemVersion  -Rarity null `
 -Version null
```

- Convert the resource to JSON
```powershell
$PokemonHeldItemVersion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

