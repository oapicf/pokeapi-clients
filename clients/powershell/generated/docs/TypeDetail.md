# TypeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**DamageRelations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | 
**PastDamageRelations** | [**TypeDetailPastDamageRelationsInner[]**](TypeDetailPastDamageRelationsInner.md) |  | [readonly] 
**GameIndices** | [**TypeGameIndex[]**](TypeGameIndex.md) |  | [readonly] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**MoveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**Names** | [**AbilityName[]**](AbilityName.md) |  | [readonly] 
**Pokemon** | [**TypeDetailPokemonInner[]**](TypeDetailPokemonInner.md) |  | [readonly] 
**Moves** | [**MoveSummary[]**](MoveSummary.md) |  | [readonly] 
**Sprites** | [**System.Collections.Hashtable**](Map.md) |  | [readonly] 

## Examples

- Prepare the resource
```powershell
$TypeDetail = Initialize-PSOpenAPIToolsTypeDetail  -Id null `
 -Name null `
 -DamageRelations null `
 -PastDamageRelations null `
 -GameIndices null `
 -Generation null `
 -MoveDamageClass null `
 -Names null `
 -Pokemon null `
 -Moves null `
 -Sprites null
```

- Convert the resource to JSON
```powershell
$TypeDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

