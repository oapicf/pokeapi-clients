
# PokemonSpeciesDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`order` | number
`genderRate` | number
`captureRate` | number
`baseHappiness` | number
`isBaby` | boolean
`isLegendary` | boolean
`isMythical` | boolean
`hatchCounter` | number
`hasGenderDifferences` | boolean
`formsSwitchable` | boolean
`growthRate` | [GrowthRateSummary](GrowthRateSummary.md)
`pokedexNumbers` | [Array&lt;PokemonDexEntry&gt;](PokemonDexEntry.md)
`eggGroups` | [Array&lt;EggGroupSummary&gt;](EggGroupSummary.md)
`color` | [PokemonColorSummary](PokemonColorSummary.md)
`shape` | [PokemonShapeSummary](PokemonShapeSummary.md)
`evolvesFromSpecies` | [PokemonSpeciesSummary](PokemonSpeciesSummary.md)
`evolutionChain` | [EvolutionChainSummary](EvolutionChainSummary.md)
`habitat` | [PokemonHabitatSummary](PokemonHabitatSummary.md)
`generation` | [GenerationSummary](GenerationSummary.md)
`names` | [Array&lt;PokemonSpeciesName&gt;](PokemonSpeciesName.md)
`palParkEncounters` | [Array&lt;PokemonSpeciesPalParkEncounter&gt;](PokemonSpeciesPalParkEncounter.md)
`formDescriptions` | [Array&lt;PokemonSpeciesDescription&gt;](PokemonSpeciesDescription.md)
`flavorTextEntries` | [Array&lt;PokemonSpeciesFlavorText&gt;](PokemonSpeciesFlavorText.md)
`genera` | [Array&lt;PokemonSpeciesGenus&gt;](PokemonSpeciesGenus.md)
`varieties` | [Array&lt;PokemonSpeciesVariety&gt;](PokemonSpeciesVariety.md)

## Example

```typescript
import type { PokemonSpeciesDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "order": null,
  "genderRate": null,
  "captureRate": null,
  "baseHappiness": null,
  "isBaby": null,
  "isLegendary": null,
  "isMythical": null,
  "hatchCounter": null,
  "hasGenderDifferences": null,
  "formsSwitchable": null,
  "growthRate": null,
  "pokedexNumbers": null,
  "eggGroups": null,
  "color": null,
  "shape": null,
  "evolvesFromSpecies": null,
  "evolutionChain": null,
  "habitat": null,
  "generation": null,
  "names": null,
  "palParkEncounters": null,
  "formDescriptions": null,
  "flavorTextEntries": null,
  "genera": null,
  "varieties": null,
} satisfies PokemonSpeciesDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonSpeciesDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


