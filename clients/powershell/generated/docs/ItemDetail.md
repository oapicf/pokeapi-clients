# ItemDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Cost** | **Int32** |  | [optional] 
**FlingPower** | **Int32** |  | [optional] 
**FlingEffect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**Attributes** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] 
**Category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  | 
**EffectEntries** | [**ItemEffectText[]**](ItemEffectText.md) |  | [readonly] 
**FlavorTextEntries** | [**ItemFlavorText[]**](ItemFlavorText.md) |  | [readonly] 
**GameIndices** | [**ItemGameIndex[]**](ItemGameIndex.md) |  | [readonly] 
**Names** | [**ItemName[]**](ItemName.md) |  | [readonly] 
**HeldByPokemon** | [**ItemDetailHeldByPokemonInner[]**](ItemDetailHeldByPokemonInner.md) |  | [readonly] 
**Sprites** | [**ItemDetailSprites**](ItemDetailSprites.md) |  | 
**BabyTriggerFor** | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  | 
**Machines** | [**ItemDetailMachinesInner[]**](ItemDetailMachinesInner.md) |  | [readonly] 

## Examples

- Prepare the resource
```powershell
$ItemDetail = Initialize-PSOpenAPIToolsItemDetail  -Id null `
 -Name null `
 -Cost null `
 -FlingPower null `
 -FlingEffect null `
 -Attributes null `
 -Category null `
 -EffectEntries null `
 -FlavorTextEntries null `
 -GameIndices null `
 -Names null `
 -HeldByPokemon null `
 -Sprites null `
 -BabyTriggerFor null `
 -Machines null
```

- Convert the resource to JSON
```powershell
$ItemDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

