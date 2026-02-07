
# ItemDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`cost` | number
`flingPower` | number
`flingEffect` | [ItemFlingEffectSummary](ItemFlingEffectSummary.md)
`attributes` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)
`category` | [ItemCategorySummary](ItemCategorySummary.md)
`effectEntries` | [Array&lt;ItemEffectText&gt;](ItemEffectText.md)
`flavorTextEntries` | [Array&lt;ItemFlavorText&gt;](ItemFlavorText.md)
`gameIndices` | [Array&lt;ItemGameIndex&gt;](ItemGameIndex.md)
`names` | [Array&lt;ItemName&gt;](ItemName.md)
`heldByPokemon` | [Array&lt;ItemDetailHeldByPokemonInner&gt;](ItemDetailHeldByPokemonInner.md)
`sprites` | [ItemDetailSprites](ItemDetailSprites.md)
`babyTriggerFor` | [ItemDetailBabyTriggerFor](ItemDetailBabyTriggerFor.md)
`machines` | [Array&lt;ItemDetailMachinesInner&gt;](ItemDetailMachinesInner.md)

## Example

```typescript
import type { ItemDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "cost": null,
  "flingPower": null,
  "flingEffect": null,
  "attributes": null,
  "category": null,
  "effectEntries": null,
  "flavorTextEntries": null,
  "gameIndices": null,
  "names": null,
  "heldByPokemon": null,
  "sprites": null,
  "babyTriggerFor": null,
  "machines": null,
} satisfies ItemDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


