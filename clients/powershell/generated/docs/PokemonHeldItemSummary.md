# PokemonHeldItemSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | [**ItemSummary**](ItemSummary.md) | The item the referenced Pokémon holds. | 
**VersionDetails** | [**PokemonHeldItemVersion[]**](PokemonHeldItemVersion.md) | The details of the different versions in which the item is held. | 

## Examples

- Prepare the resource
```powershell
$PokemonHeldItemSummary = Initialize-PSOpenAPIToolsPokemonHeldItemSummary  -Item null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$PokemonHeldItemSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

