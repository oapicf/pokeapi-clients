# AbilityPokemonDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsHidden** | **Boolean** | Whether or not this a hidden ability for the referenced Pokémon. | [optional] 
**Slot** | **Int32** | Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon this ability could belong to. | 

## Examples

- Prepare the resource
```powershell
$AbilityPokemonDetail = Initialize-PSOpenAPIToolsAbilityPokemonDetail  -IsHidden null `
 -Slot null `
 -Pokemon null
```

- Convert the resource to JSON
```powershell
$AbilityPokemonDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

