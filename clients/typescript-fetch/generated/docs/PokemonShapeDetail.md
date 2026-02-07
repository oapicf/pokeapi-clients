
# PokemonShapeDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`awesomeNames` | [Array&lt;PokemonShapeDetailAwesomeNamesInner&gt;](PokemonShapeDetailAwesomeNamesInner.md)
`names` | [Array&lt;PokemonShapeDetailNamesInner&gt;](PokemonShapeDetailNamesInner.md)
`pokemonSpecies` | [Array&lt;PokemonSpeciesSummary&gt;](PokemonSpeciesSummary.md)

## Example

```typescript
import type { PokemonShapeDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "awesomeNames": null,
  "names": null,
  "pokemonSpecies": null,
} satisfies PokemonShapeDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonShapeDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


