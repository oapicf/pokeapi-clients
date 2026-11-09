# TypePokemon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Slot** | **Int32** | The order the Pokémon&#39;s types are listed in. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that has the referenced type. | 

## Examples

- Prepare the resource
```powershell
$TypePokemon = Initialize-PSOpenAPIToolsTypePokemon  -Slot null `
 -Pokemon null
```

- Convert the resource to JSON
```powershell
$TypePokemon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

