
# GenerationDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`abilities` | [Array&lt;AbilitySummary&gt;](AbilitySummary.md)
`mainRegion` | [RegionSummary](RegionSummary.md)
`moves` | [Array&lt;MoveSummary&gt;](MoveSummary.md)
`names` | [Array&lt;GenerationName&gt;](GenerationName.md)
`pokemonSpecies` | [Array&lt;PokemonSpeciesSummary&gt;](PokemonSpeciesSummary.md)
`types` | [Array&lt;TypeSummary&gt;](TypeSummary.md)
`versionGroups` | [Array&lt;VersionGroupSummary&gt;](VersionGroupSummary.md)

## Example

```typescript
import type { GenerationDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "abilities": null,
  "mainRegion": null,
  "moves": null,
  "names": null,
  "pokemonSpecies": null,
  "types": null,
  "versionGroups": null,
} satisfies GenerationDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GenerationDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


