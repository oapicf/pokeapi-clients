# PokemonDetailPastAbilitiesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Abilities** | [**PokemonDetailAbilitiesInner[]**](PokemonDetailAbilitiesInner.md) |  | 
**Generation** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonDetailPastAbilitiesInner = Initialize-PSOpenAPIToolsPokemonDetailPastAbilitiesInner  -Abilities null `
 -Generation null
```

- Convert the resource to JSON
```powershell
$PokemonDetailPastAbilitiesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

