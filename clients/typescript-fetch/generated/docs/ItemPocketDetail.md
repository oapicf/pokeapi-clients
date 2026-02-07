
# ItemPocketDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`categories` | [Array&lt;ItemCategorySummary&gt;](ItemCategorySummary.md)
`names` | [Array&lt;ItemPocketName&gt;](ItemPocketName.md)

## Example

```typescript
import type { ItemPocketDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "categories": null,
  "names": null,
} satisfies ItemPocketDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemPocketDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


