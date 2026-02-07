
# NatureDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`decreasedStat` | [StatSummary](StatSummary.md)
`increasedStat` | [StatSummary](StatSummary.md)
`likesFlavor` | [BerryFlavorSummary](BerryFlavorSummary.md)
`hatesFlavor` | [BerryFlavorSummary](BerryFlavorSummary.md)
`berries` | [Array&lt;BerrySummary&gt;](BerrySummary.md)
`pokeathlonStatChanges` | [Array&lt;NatureDetailPokeathlonStatChangesInner&gt;](NatureDetailPokeathlonStatChangesInner.md)
`moveBattleStylePreferences` | [Array&lt;NatureBattleStylePreference&gt;](NatureBattleStylePreference.md)
`names` | [Array&lt;NatureName&gt;](NatureName.md)

## Example

```typescript
import type { NatureDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "decreasedStat": null,
  "increasedStat": null,
  "likesFlavor": null,
  "hatesFlavor": null,
  "berries": null,
  "pokeathlonStatChanges": null,
  "moveBattleStylePreferences": null,
  "names": null,
} satisfies NatureDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as NatureDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


