
# ItemCategoryDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`items` | [Array&lt;ItemSummary&gt;](ItemSummary.md)
`names` | [Array&lt;ItemCategoryName&gt;](ItemCategoryName.md)
`pocket` | [ItemPocketSummary](ItemPocketSummary.md)

## Example

```typescript
import type { ItemCategoryDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "items": null,
  "names": null,
  "pocket": null,
} satisfies ItemCategoryDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemCategoryDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


