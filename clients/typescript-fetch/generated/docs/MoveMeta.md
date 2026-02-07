
# MoveMeta


## Properties

Name | Type
------------ | -------------
`ailment` | [MoveMetaAilmentSummary](MoveMetaAilmentSummary.md)
`category` | [MoveMetaCategorySummary](MoveMetaCategorySummary.md)
`minHits` | number
`maxHits` | number
`minTurns` | number
`maxTurns` | number
`drain` | number
`healing` | number
`critRate` | number
`ailmentChance` | number
`flinchChance` | number
`statChance` | number

## Example

```typescript
import type { MoveMeta } from ''

// TODO: Update the object below with actual values
const example = {
  "ailment": null,
  "category": null,
  "minHits": null,
  "maxHits": null,
  "minTurns": null,
  "maxTurns": null,
  "drain": null,
  "healing": null,
  "critRate": null,
  "ailmentChance": null,
  "flinchChance": null,
  "statChance": null,
} satisfies MoveMeta

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MoveMeta
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


