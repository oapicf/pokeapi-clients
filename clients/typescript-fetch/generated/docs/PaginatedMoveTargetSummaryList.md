
# PaginatedMoveTargetSummaryList


## Properties

Name | Type
------------ | -------------
`count` | number
`next` | string
`previous` | string
`results` | [Array&lt;MoveTargetSummary&gt;](MoveTargetSummary.md)

## Example

```typescript
import type { PaginatedMoveTargetSummaryList } from ''

// TODO: Update the object below with actual values
const example = {
  "count": 100,
  "next": https://pokeapi.co/api/v2/move-target/?offset=40&limit=20,
  "previous": https://pokeapi.co/api/v2/move-target/?offset=0&limit=20,
  "results": null,
} satisfies PaginatedMoveTargetSummaryList

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PaginatedMoveTargetSummaryList
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


