
# EvolutionChainLink


## Properties

Name | Type
------------ | -------------
`isBaby` | boolean
`species` | [PokemonSpeciesSummary](PokemonSpeciesSummary.md)
`evolutionDetails` | [Array&lt;PokemonEvolution&gt;](PokemonEvolution.md)
`evolvesTo` | [Array&lt;EvolutionChainLink&gt;](EvolutionChainLink.md)

## Example

```typescript
import type { EvolutionChainLink } from ''

// TODO: Update the object below with actual values
const example = {
  "isBaby": null,
  "species": null,
  "evolutionDetails": null,
  "evolvesTo": null,
} satisfies EvolutionChainLink

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvolutionChainLink
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


