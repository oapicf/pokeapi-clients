# PokemonType
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Slot** | **Int32** | The order the Pokémon&#39;s types are listed in. | 
**Type** | [**TypeSummary**](TypeSummary.md) | The type the referenced Pokémon has. | 

## Examples

- Prepare the resource
```powershell
$PokemonType = Initialize-PSOpenAPIToolsPokemonType  -Slot null `
 -Type null
```

- Convert the resource to JSON
```powershell
$PokemonType | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

