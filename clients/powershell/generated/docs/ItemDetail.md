# ItemDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**FlingPower** | **Int32** | The power of the move Fling when used with this item. | [optional] 
**FlingEffect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**Attributes** | [**ItemAttributeSummary[]**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**Category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**EffectEntries** | [**ItemEffectText[]**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**FlavorTextEntries** | [**ItemFlavorText[]**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**GameIndices** | [**ItemGameIndex[]**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**Prices** | [**ItemPrice[]**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**Names** | [**ItemName[]**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**HeldByPokemon** | [**PokemonHeldItem[]**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**Sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**BabyTriggerFor** | [**EvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**Machines** | [**ItemMachine[]**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 

## Examples

- Prepare the resource
```powershell
$ItemDetail = Initialize-PSOpenAPIToolsItemDetail  -Id null `
 -Name null `
 -FlingPower null `
 -FlingEffect null `
 -Attributes null `
 -Category null `
 -EffectEntries null `
 -FlavorTextEntries null `
 -GameIndices null `
 -Prices null `
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

