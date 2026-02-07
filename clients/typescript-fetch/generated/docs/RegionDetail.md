
# RegionDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`locations` | [Array&lt;LocationSummary&gt;](LocationSummary.md)
`mainGeneration` | [GenerationSummary](GenerationSummary.md)
`names` | [Array&lt;RegionName&gt;](RegionName.md)
`pokedexes` | [Array&lt;PokedexSummary&gt;](PokedexSummary.md)
`versionGroups` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)

## Example

```typescript
import type { RegionDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "locations": null,
  "mainGeneration": null,
  "names": null,
  "pokedexes": null,
  "versionGroups": null,
} satisfies RegionDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RegionDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


