
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
`abilities` | [Array&lt;PokemonAbility&gt;](PokemonAbility.md)
`pastAbilities` | [Array&lt;PokemonPastAbility&gt;](PokemonPastAbility.md)
`forms` | [Array&lt;PokemonFormSummary&gt;](PokemonFormSummary.md)
`gameIndices` | [Array&lt;PokemonGameIndex&gt;](PokemonGameIndex.md)
`heldItems` | [Array&lt;PokemonHeldItemSummary&gt;](PokemonHeldItemSummary.md)
`locationAreaEncounters` | string
`moves` | [Array&lt;PokemonMove&gt;](PokemonMove.md)
`species` | [PokemonSpeciesSummary](PokemonSpeciesSummary.md)
`sprites` | [PokemonSprites](PokemonSprites.md)
`cries` | [PokemonCries](PokemonCries.md)
`stats` | [Array&lt;PokemonStat&gt;](PokemonStat.md)
`pastStats` | [Array&lt;PokemonPastStat&gt;](PokemonPastStat.md)
`types` | [Array&lt;PokemonType&gt;](PokemonType.md)
`pastTypes` | [Array&lt;PokemonPastType&gt;](PokemonPastType.md)

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
  "pastStats": null,
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


