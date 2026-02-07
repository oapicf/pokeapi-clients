
# BerryFirmnessDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`berries` | [Array&lt;BerrySummary&gt;](BerrySummary.md)
`names` | [Array&lt;BerryFirmnessName&gt;](BerryFirmnessName.md)

## Example

```typescript
import type { BerryFirmnessDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "berries": null,
  "names": null,
} satisfies BerryFirmnessDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BerryFirmnessDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


