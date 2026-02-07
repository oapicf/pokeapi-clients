
# ContestTypeDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`berryFlavor` | [BerryFlavorSummary](BerryFlavorSummary.md)
`names` | [Array&lt;ContestTypeName&gt;](ContestTypeName.md)

## Example

```typescript
import type { ContestTypeDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "berryFlavor": null,
  "names": null,
} satisfies ContestTypeDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ContestTypeDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


