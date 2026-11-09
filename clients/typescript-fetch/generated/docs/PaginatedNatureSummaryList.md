
# PaginatedNatureSummaryList


## Properties

Name | Type
------------ | -------------
`count` | number
`next` | string
`previous` | string
`results` | [Array&lt;NatureSummary&gt;](NatureSummary.md)

## Example

```typescript
import type { PaginatedNatureSummaryList } from ''

// TODO: Update the object below with actual values
const example = {
  "count": 100,
  "next": https://pokeapi.co/api/v2/nature/?offset=40&limit=20,
  "previous": https://pokeapi.co/api/v2/nature/?offset=0&limit=20,
  "results": null,
} satisfies PaginatedNatureSummaryList

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PaginatedNatureSummaryList
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


