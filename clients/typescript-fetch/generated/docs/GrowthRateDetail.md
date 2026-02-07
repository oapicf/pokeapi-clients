
# GrowthRateDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`formula` | string
`descriptions` | [Array&lt;GrowthRateDescription&gt;](GrowthRateDescription.md)
`levels` | [Array&lt;Experience&gt;](Experience.md)
`pokemonSpecies` | [Array&lt;PokemonSpeciesSummary&gt;](PokemonSpeciesSummary.md)

## Example

```typescript
import type { GrowthRateDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "formula": null,
  "descriptions": null,
  "levels": null,
  "pokemonSpecies": null,
} satisfies GrowthRateDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GrowthRateDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


