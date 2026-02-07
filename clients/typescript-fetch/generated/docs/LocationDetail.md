
# LocationDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`region` | [RegionSummary](RegionSummary.md)
`names` | [Array&lt;LocationName&gt;](LocationName.md)
`gameIndices` | [Array&lt;LocationGameIndex&gt;](LocationGameIndex.md)
`areas` | [Array&lt;LocationAreaSummary&gt;](LocationAreaSummary.md)

## Example

```typescript
import type { LocationDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "region": null,
  "names": null,
  "gameIndices": null,
  "areas": null,
} satisfies LocationDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocationDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


