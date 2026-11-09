# PokemonAbility
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsHidden** | **Boolean** | Whether or not this is a hidden ability. | [optional] 
**Slot** | **Int32** | The slot this ability occupies in this Pokémon species. | 
**Ability** | [**AbilitySummary**](AbilitySummary.md) | The ability the Pokémon may have. | 

## Examples

- Prepare the resource
```powershell
$PokemonAbility = Initialize-PSOpenAPIToolsPokemonAbility  -IsHidden null `
 -Slot null `
 -Ability null
```

- Convert the resource to JSON
```powershell
$PokemonAbility | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

