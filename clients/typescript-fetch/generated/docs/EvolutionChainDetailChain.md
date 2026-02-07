
# EvolutionChainDetailChain


## Properties

Name | Type
------------ | -------------
`evolutionDetails` | Array&lt;any&gt;
`evolvesTo` | [Array&lt;EvolutionChainDetailChainEvolvesToInner&gt;](EvolutionChainDetailChainEvolvesToInner.md)
`isBaby` | boolean
`species` | [AbilityDetailPokemonInnerPokemon](AbilityDetailPokemonInnerPokemon.md)

## Example

```typescript
import type { EvolutionChainDetailChain } from ''

// TODO: Update the object below with actual values
const example = {
  "evolutionDetails": null,
  "evolvesTo": null,
  "isBaby": null,
  "species": null,
} satisfies EvolutionChainDetailChain

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvolutionChainDetailChain
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


