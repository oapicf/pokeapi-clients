# ItemDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**Cost** | **Int32** |  | [optional] 
**FlingPower** | **Int32** |  | [optional] 
**FlingEffect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**Attributes** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  | 
**EffectEntries** | [**ItemEffectText[]**](ItemEffectText.md) |  | 
**FlavorTextEntries** | [**ItemFlavorText[]**](ItemFlavorText.md) |  | 
**GameIndices** | [**ItemGameIndex[]**](ItemGameIndex.md) |  | 
**Names** | [**ItemName[]**](ItemName.md) |  | 
**HeldByPokemon** | [**ItemDetailHeldByPokemonInner[]**](ItemDetailHeldByPokemonInner.md) |  | 
**Sprites** | [**ItemDetailSprites**](ItemDetailSprites.md) |  | 
**BabyTriggerFor** | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  | 
**Machines** | [**ItemDetailMachinesInner[]**](ItemDetailMachinesInner.md) |  | 

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

