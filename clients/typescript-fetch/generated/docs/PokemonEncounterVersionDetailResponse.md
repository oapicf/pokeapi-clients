
# PokemonEncounterVersionDetailResponse


## Properties

Name | Type
------------ | -------------
`version` | [VersionSummary](VersionSummary.md)
`maxChance` | number
`encounterDetails` | [Array&lt;PokemonEncounterDetailResponse&gt;](PokemonEncounterDetailResponse.md)

## Example

```typescript
import type { PokemonEncounterVersionDetailResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "version": null,
  "maxChance": null,
  "encounterDetails": null,
} satisfies PokemonEncounterVersionDetailResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonEncounterVersionDetailResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


