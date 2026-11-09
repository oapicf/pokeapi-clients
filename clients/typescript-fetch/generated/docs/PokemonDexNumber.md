
# PokemonDexNumber


## Properties

Name | Type
------------ | -------------
`entryNumber` | number
`pokemonSpecies` | [PokemonSpeciesSummary](PokemonSpeciesSummary.md)

## Example

```typescript
import type { PokemonDexNumber } from ''

// TODO: Update the object below with actual values
const example = {
  "entryNumber": null,
  "pokemonSpecies": null,
} satisfies PokemonDexNumber

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonDexNumber
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


