
# PokemonPastType


## Properties

Name | Type
------------ | -------------
`generation` | [GenerationSummary](GenerationSummary.md)
`types` | [Array&lt;PokemonType&gt;](PokemonType.md)

## Example

```typescript
import type { PokemonPastType } from ''

// TODO: Update the object below with actual values
const example = {
  "generation": null,
  "types": null,
} satisfies PokemonPastType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonPastType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


