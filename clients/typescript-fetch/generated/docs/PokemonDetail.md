
# PokemonDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`baseExperience` | number
`height` | number
`isDefault` | boolean
`order` | number
`weight` | number
`abilities` | [Array&lt;PokemonDetailAbilitiesInner&gt;](PokemonDetailAbilitiesInner.md)
`pastAbilities` | [Array&lt;PokemonDetailPastAbilitiesInner&gt;](PokemonDetailPastAbilitiesInner.md)
`forms` | [Array&lt;PokemonFormSummary&gt;](PokemonFormSummary.md)
`gameIndices` | [Array&lt;PokemonGameIndex&gt;](PokemonGameIndex.md)
`heldItems` | [PokemonDetailHeldItems](PokemonDetailHeldItems.md)
`locationAreaEncounters` | string
`moves` | [Array&lt;PokemonDetailMovesInner&gt;](PokemonDetailMovesInner.md)
`species` | [PokemonSpeciesSummary](PokemonSpeciesSummary.md)
`sprites` | [PokemonDetailSprites](PokemonDetailSprites.md)
`cries` | [PokemonDetailCries](PokemonDetailCries.md)
`stats` | [Array&lt;PokemonStat&gt;](PokemonStat.md)
`types` | [Array&lt;PokemonDetailTypesInner&gt;](PokemonDetailTypesInner.md)
`pastTypes` | [Array&lt;PokemonDetailPastTypesInner&gt;](PokemonDetailPastTypesInner.md)

## Example

```typescript
import type { PokemonDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "baseExperience": null,
  "height": null,
  "isDefault": null,
  "order": null,
  "weight": null,
  "abilities": null,
  "pastAbilities": null,
  "forms": null,
  "gameIndices": null,
  "heldItems": null,
  "locationAreaEncounters": null,
  "moves": null,
  "species": null,
  "sprites": null,
  "cries": null,
  "stats": null,
  "types": null,
  "pastTypes": null,
} satisfies PokemonDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


