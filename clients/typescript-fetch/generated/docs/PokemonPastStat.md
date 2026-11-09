
# PokemonPastStat


## Properties

Name | Type
------------ | -------------
`generation` | [GenerationSummary](GenerationSummary.md)
`stats` | [Array&lt;PokemonStat&gt;](PokemonStat.md)

## Example

```typescript
import type { PokemonPastStat } from ''

// TODO: Update the object below with actual values
const example = {
  "generation": null,
  "stats": null,
} satisfies PokemonPastStat

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonPastStat
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


