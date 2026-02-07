
# VersionGroupDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`order` | number
`generation` | [GenerationSummary](GenerationSummary.md)
`moveLearnMethods` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)
`pokedexes` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)
`regions` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)
`versions` | [Array&lt;VersionSummary&gt;](VersionSummary.md)

## Example

```typescript
import type { VersionGroupDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "order": null,
  "generation": null,
  "moveLearnMethods": null,
  "pokedexes": null,
  "regions": null,
  "versions": null,
} satisfies VersionGroupDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VersionGroupDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


