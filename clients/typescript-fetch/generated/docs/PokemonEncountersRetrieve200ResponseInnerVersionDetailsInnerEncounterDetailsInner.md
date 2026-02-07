
# PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner


## Properties

Name | Type
------------ | -------------
`chance` | number
`conditionValues` | [Array&lt;PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner&gt;](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner.md)
`maxLevel` | number
`method` | [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod](PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod.md)
`minLevel` | number

## Example

```typescript
import type { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "chance": 100,
  "conditionValues": null,
  "maxLevel": 10,
  "method": null,
  "minLevel": 10,
} satisfies PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


