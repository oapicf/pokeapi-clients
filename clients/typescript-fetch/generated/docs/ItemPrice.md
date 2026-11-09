
# ItemPrice


## Properties

Name | Type
------------ | -------------
`purchasePrice` | number
`sellPrice` | number
`currency` | [CurrencySummary](CurrencySummary.md)
`versionGroup` | [VersionGroupSummary](VersionGroupSummary.md)

## Example

```typescript
import type { ItemPrice } from ''

// TODO: Update the object below with actual values
const example = {
  "purchasePrice": null,
  "sellPrice": null,
  "currency": null,
  "versionGroup": null,
} satisfies ItemPrice

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemPrice
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


