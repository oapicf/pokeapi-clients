# PokemonDetailAbilitiesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ability** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**IsHidden** | **Boolean** |  | 
**Slot** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$PokemonDetailAbilitiesInner = Initialize-PSOpenAPIToolsPokemonDetailAbilitiesInner  -Ability null `
 -IsHidden null `
 -Slot null
```

- Convert the resource to JSON
```powershell
$PokemonDetailAbilitiesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

