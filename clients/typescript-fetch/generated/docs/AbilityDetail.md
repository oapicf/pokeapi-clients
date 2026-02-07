
# AbilityDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`isMainSeries` | boolean
`generation` | [GenerationSummary](GenerationSummary.md)
`names` | [Array&lt;AbilityName&gt;](AbilityName.md)
`effectEntries` | [Array&lt;AbilityEffectText&gt;](AbilityEffectText.md)
`effectChanges` | [Array&lt;AbilityChange&gt;](AbilityChange.md)
`flavorTextEntries` | [Array&lt;AbilityFlavorText&gt;](AbilityFlavorText.md)
`pokemon` | [Array&lt;AbilityDetailPokemonInner&gt;](AbilityDetailPokemonInner.md)

## Example

```typescript
import type { AbilityDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "isMainSeries": null,
  "generation": null,
  "names": null,
  "effectEntries": null,
  "effectChanges": null,
  "flavorTextEntries": null,
  "pokemon": null,
} satisfies AbilityDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AbilityDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


