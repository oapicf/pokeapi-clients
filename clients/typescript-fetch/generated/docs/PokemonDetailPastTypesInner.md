
# PokemonDetailPastTypesInner


## Properties

Name | Type
------------ | -------------
`generation` | [AbilityDetailPokemonInnerPokemon](AbilityDetailPokemonInnerPokemon.md)
`types` | [Array&lt;PokemonDetailTypesInner&gt;](PokemonDetailTypesInner.md)

## Example

```typescript
import type { PokemonDetailPastTypesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "generation": null,
  "types": null,
} satisfies PokemonDetailPastTypesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonDetailPastTypesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


