
# EggGroupDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`names` | [Array&lt;EggGroupName&gt;](EggGroupName.md)
`pokemonSpecies` | [Array&lt;EggGroupDetailPokemonSpeciesInner&gt;](EggGroupDetailPokemonSpeciesInner.md)

## Example

```typescript
import type { EggGroupDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "names": null,
  "pokemonSpecies": null,
} satisfies EggGroupDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EggGroupDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


