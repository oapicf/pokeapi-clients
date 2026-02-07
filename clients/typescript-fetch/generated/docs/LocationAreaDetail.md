
# LocationAreaDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`gameIndex` | number
`encounterMethodRates` | [Array&lt;LocationAreaDetailEncounterMethodRatesInner&gt;](LocationAreaDetailEncounterMethodRatesInner.md)
`location` | [LocationSummary](LocationSummary.md)
`names` | [Array&lt;LocationAreaName&gt;](LocationAreaName.md)
`pokemonEncounters` | [Array&lt;LocationAreaDetailPokemonEncountersInner&gt;](LocationAreaDetailPokemonEncountersInner.md)

## Example

```typescript
import type { LocationAreaDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "gameIndex": null,
  "encounterMethodRates": null,
  "location": null,
  "names": null,
  "pokemonEncounters": null,
} satisfies LocationAreaDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocationAreaDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


