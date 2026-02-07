
# PokemonDexEntry


## Properties

Name | Type
------------ | -------------
`entryNumber` | number
`pokedex` | [PokedexSummary](PokedexSummary.md)

## Example

```typescript
import type { PokemonDexEntry } from ''

// TODO: Update the object below with actual values
const example = {
  "entryNumber": null,
  "pokedex": null,
} satisfies PokemonDexEntry

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonDexEntry
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


