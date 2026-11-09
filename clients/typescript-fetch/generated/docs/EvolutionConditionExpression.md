
# EvolutionConditionExpression


## Properties

Name | Type
------------ | -------------
`expression` | string
`percentageChance` | number
`variables` | [Array&lt;EvolutionVariableSummary&gt;](EvolutionVariableSummary.md)

## Example

```typescript
import type { EvolutionConditionExpression } from ''

// TODO: Update the object below with actual values
const example = {
  "expression": null,
  "percentageChance": null,
  "variables": null,
} satisfies EvolutionConditionExpression

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvolutionConditionExpression
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


