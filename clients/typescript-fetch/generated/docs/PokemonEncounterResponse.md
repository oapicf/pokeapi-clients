
# PokemonEncounterResponse


## Properties

Name | Type
------------ | -------------
`locationArea` | [LocationAreaSummary](LocationAreaSummary.md)
`versionDetails` | [Array&lt;PokemonEncounterVersionDetailResponse&gt;](PokemonEncounterVersionDetailResponse.md)

## Example

```typescript
import type { PokemonEncounterResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "locationArea": null,
  "versionDetails": null,
} satisfies PokemonEncounterResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonEncounterResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


