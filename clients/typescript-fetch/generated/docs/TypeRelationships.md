
# TypeRelationships


## Properties

Name | Type
------------ | -------------
`noDamageTo` | [Array&lt;TypeSummary&gt;](TypeSummary.md)
`halfDamageTo` | [Array&lt;TypeSummary&gt;](TypeSummary.md)
`doubleDamageTo` | [Array&lt;TypeSummary&gt;](TypeSummary.md)
`noDamageFrom` | [Array&lt;TypeSummary&gt;](TypeSummary.md)
`halfDamageFrom` | [Array&lt;TypeSummary&gt;](TypeSummary.md)
`doubleDamageFrom` | [Array&lt;TypeSummary&gt;](TypeSummary.md)

## Example

```typescript
import type { TypeRelationships } from ''

// TODO: Update the object below with actual values
const example = {
  "noDamageTo": null,
  "halfDamageTo": null,
  "doubleDamageTo": null,
  "noDamageFrom": null,
  "halfDamageFrom": null,
  "doubleDamageFrom": null,
} satisfies TypeRelationships

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TypeRelationships
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


