
# PokemonHeldItem


## Properties

Name | Type
------------ | -------------
`pokemon` | [PokemonSummary](PokemonSummary.md)
`versionDetails` | [Array&lt;PokemonHeldItemVersion&gt;](PokemonHeldItemVersion.md)

## Example

```typescript
import type { PokemonHeldItem } from ''

// TODO: Update the object below with actual values
const example = {
  "pokemon": null,
  "versionDetails": null,
} satisfies PokemonHeldItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonHeldItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


