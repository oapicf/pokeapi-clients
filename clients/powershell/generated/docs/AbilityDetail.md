# AbilityDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**IsMainSeries** | **Boolean** |  | [optional] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**Names** | [**AbilityName[]**](AbilityName.md) |  | [readonly] 
**EffectEntries** | [**AbilityEffectText[]**](AbilityEffectText.md) |  | [readonly] 
**EffectChanges** | [**AbilityChange[]**](AbilityChange.md) |  | [readonly] 
**FlavorTextEntries** | [**AbilityFlavorText[]**](AbilityFlavorText.md) |  | [readonly] 
**Pokemon** | [**AbilityDetailPokemonInner[]**](AbilityDetailPokemonInner.md) |  | [readonly] 

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

