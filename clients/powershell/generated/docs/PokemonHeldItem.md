# PokemonHeldItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that holds this item. | 
**VersionDetails** | [**PokemonHeldItemVersion[]**](PokemonHeldItemVersion.md) | The details for the version that this item is held in by the Pokémon. | 

## Examples

- Prepare the resource
```powershell
$PokemonHeldItem = Initialize-PSOpenAPIToolsPokemonHeldItem  -Pokemon null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$PokemonHeldItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

