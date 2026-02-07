
# BerryFlavorDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`berries` | [Array&lt;BerryFlavorDetailBerriesInner&gt;](BerryFlavorDetailBerriesInner.md)
`contestType` | [ContestTypeSummary](ContestTypeSummary.md)
`names` | [Array&lt;BerryFlavorName&gt;](BerryFlavorName.md)

## Example

```typescript
import type { BerryFlavorDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "berries": null,
  "contestType": null,
  "names": null,
} satisfies BerryFlavorDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BerryFlavorDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


