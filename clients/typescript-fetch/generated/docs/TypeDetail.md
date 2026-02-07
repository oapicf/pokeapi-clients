
# TypeDetail

Serializer for the Type resource

## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`damageRelations` | [TypeDetailDamageRelations](TypeDetailDamageRelations.md)
`pastDamageRelations` | [Array&lt;TypeDetailPastDamageRelationsInner&gt;](TypeDetailPastDamageRelationsInner.md)
`gameIndices` | [Array&lt;TypeGameIndex&gt;](TypeGameIndex.md)
`generation` | [GenerationSummary](GenerationSummary.md)
`moveDamageClass` | [MoveDamageClassSummary](MoveDamageClassSummary.md)
`names` | [Array&lt;AbilityName&gt;](AbilityName.md)
`pokemon` | [Array&lt;TypeDetailPokemonInner&gt;](TypeDetailPokemonInner.md)
`moves` | [Array&lt;MoveSummary&gt;](MoveSummary.md)
`sprites` | { [key: string]: { [key: string]: TypeDetailSpritesValueValue; }; }

## Example

```typescript
import type { TypeDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "damageRelations": null,
  "pastDamageRelations": null,
  "gameIndices": null,
  "generation": null,
  "moveDamageClass": null,
  "names": null,
  "pokemon": null,
  "moves": null,
  "sprites": null,
} satisfies TypeDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TypeDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


