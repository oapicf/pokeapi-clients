
# PokemonHeldItemSummary


## Properties

Name | Type
------------ | -------------
`item` | [ItemSummary](ItemSummary.md)
`versionDetails` | [Array&lt;PokemonHeldItemVersion&gt;](PokemonHeldItemVersion.md)

## Example

```typescript
import type { PokemonHeldItemSummary } from ''

// TODO: Update the object below with actual values
const example = {
  "item": null,
  "versionDetails": null,
} satisfies PokemonHeldItemSummary

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonHeldItemSummary
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


