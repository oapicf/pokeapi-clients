
# CharacteristicDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`geneModulo` | number
`possibleValues` | Array&lt;number&gt;
`highestStat` | [StatSummary](StatSummary.md)
`descriptions` | [Array&lt;CharacteristicDescription&gt;](CharacteristicDescription.md)

## Example

```typescript
import type { CharacteristicDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "geneModulo": null,
  "possibleValues": null,
  "highestStat": null,
  "descriptions": null,
} satisfies CharacteristicDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CharacteristicDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


