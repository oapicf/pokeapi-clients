
# LocationAreaEncounterDetail


## Properties

Name | Type
------------ | -------------
`minLevel` | number
`maxLevel` | number
`chance` | number
`method` | [EncounterMethodSummary](EncounterMethodSummary.md)
`conditionValues` | [Array&lt;EncounterConditionValueSummary&gt;](EncounterConditionValueSummary.md)
`pokemonDetails` | [EncounterPokemonDetail](EncounterPokemonDetail.md)

## Example

```typescript
import type { LocationAreaEncounterDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "minLevel": null,
  "maxLevel": null,
  "chance": null,
  "method": null,
  "conditionValues": null,
  "pokemonDetails": null,
} satisfies LocationAreaEncounterDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocationAreaEncounterDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


