# PokemonPastAbility
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Abilities** | [**PokemonAbilityPast[]**](PokemonAbilityPast.md) | The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed abilities. | 

## Examples

- Prepare the resource
```powershell
$PokemonPastAbility = Initialize-PSOpenAPIToolsPokemonPastAbility  -Abilities null `
 -Generation null
```

- Convert the resource to JSON
```powershell
$PokemonPastAbility | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

