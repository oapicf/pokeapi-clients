
# StatDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`gameIndex` | number
`isBattleOnly` | boolean
`affectingMoves` | [StatDetailAffectingMoves](StatDetailAffectingMoves.md)
`affectingNatures` | [StatDetailAffectingNatures](StatDetailAffectingNatures.md)
`characteristics` | [Array&lt;CharacteristicSummary&gt;](CharacteristicSummary.md)
`moveDamageClass` | [MoveDamageClassSummary](MoveDamageClassSummary.md)
`names` | [Array&lt;StatName&gt;](StatName.md)

## Example

```typescript
import type { StatDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "gameIndex": null,
  "isBattleOnly": null,
  "affectingMoves": null,
  "affectingNatures": null,
  "characteristics": null,
  "moveDamageClass": null,
  "names": null,
} satisfies StatDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as StatDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


