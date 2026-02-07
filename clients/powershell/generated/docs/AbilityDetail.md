# AbilityDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**IsMainSeries** | **Boolean** |  | [optional] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**Names** | [**AbilityName[]**](AbilityName.md) |  | 
**EffectEntries** | [**AbilityEffectText[]**](AbilityEffectText.md) |  | 
**EffectChanges** | [**AbilityChange[]**](AbilityChange.md) |  | 
**FlavorTextEntries** | [**AbilityFlavorText[]**](AbilityFlavorText.md) |  | 
**Pokemon** | [**AbilityDetailPokemonInner[]**](AbilityDetailPokemonInner.md) |  | 

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

