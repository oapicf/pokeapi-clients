
# PokemonDetailMovesInner


## Properties

Name | Type
------------ | -------------
`move` | [AbilityDetailPokemonInnerPokemon](AbilityDetailPokemonInnerPokemon.md)
`versionGroupDetails` | [Array&lt;PokemonDetailMovesInnerVersionGroupDetailsInner&gt;](PokemonDetailMovesInnerVersionGroupDetailsInner.md)

## Example

```typescript
import type { PokemonDetailMovesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "move": null,
  "versionGroupDetails": null,
} satisfies PokemonDetailMovesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonDetailMovesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


