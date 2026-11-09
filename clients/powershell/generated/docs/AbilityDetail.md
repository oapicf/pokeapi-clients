# AbilityDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**IsMainSeries** | **Boolean** | Whether or not this ability originated in the main series of the video games. | [optional] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | 
**Names** | [**AbilityName[]**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**EffectEntries** | [**AbilityEffectText[]**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**EffectChanges** | [**AbilityChange[]**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**FlavorTextEntries** | [**AbilityFlavorText[]**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**Pokemon** | [**AbilityPokemonDetail[]**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 

## Examples

- Prepare the resource
```powershell
$AbilityDetail = Initialize-PSOpenAPIToolsAbilityDetail  -Id null `
 -Name null `
 -IsMainSeries null `
 -Generation null `
 -Names null `
 -EffectEntries null `
 -EffectChanges null `
 -FlavorTextEntries null `
 -Pokemon null
```

- Convert the resource to JSON
```powershell
$AbilityDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

