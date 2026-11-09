
# TypePastRelationships


## Properties

Name | Type
------------ | -------------
`generation` | [GenerationSummary](GenerationSummary.md)
`damageRelations` | [TypeRelationships](TypeRelationships.md)

## Example

```typescript
import type { TypePastRelationships } from ''

// TODO: Update the object below with actual values
const example = {
  "generation": null,
  "damageRelations": null,
} satisfies TypePastRelationships

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TypePastRelationships
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


