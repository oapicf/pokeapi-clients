
# PokemonStat


## Properties

Name | Type
------------ | -------------
`baseStat` | number
`effort` | number
`stat` | [StatSummary](StatSummary.md)

## Example

```typescript
import type { PokemonStat } from ''

// TODO: Update the object below with actual values
const example = {
  "baseStat": null,
  "effort": null,
  "stat": null,
} satisfies PokemonStat

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonStat
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


