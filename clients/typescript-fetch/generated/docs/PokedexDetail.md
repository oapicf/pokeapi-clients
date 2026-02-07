
# PokedexDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`isMainSeries` | boolean
`descriptions` | [Array&lt;PokedexDescription&gt;](PokedexDescription.md)
`names` | [Array&lt;PokedexName&gt;](PokedexName.md)
`pokemonEntries` | [Array&lt;PokedexDetailPokemonEntriesInner&gt;](PokedexDetailPokemonEntriesInner.md)
`region` | [RegionSummary](RegionSummary.md)
`versionGroups` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)

## Example

```typescript
import type { PokedexDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "isMainSeries": null,
  "descriptions": null,
  "names": null,
  "pokemonEntries": null,
  "region": null,
  "versionGroups": null,
} satisfies PokedexDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokedexDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


