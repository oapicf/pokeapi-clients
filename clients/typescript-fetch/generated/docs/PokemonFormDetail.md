
# PokemonFormDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`order` | number
`formOrder` | number
`isDefault` | boolean
`isBattleOnly` | boolean
`isMega` | boolean
`formName` | string
`pokemon` | [PokemonSummary](PokemonSummary.md)
`sprites` | [PokemonFormSprites](PokemonFormSprites.md)
`versionGroup` | [VersionGroupSummary](VersionGroupSummary.md)
`formNames` | [Array&lt;PokemonFormName&gt;](PokemonFormName.md)
`names` | [Array&lt;PokemonFormName&gt;](PokemonFormName.md)
`types` | [Array&lt;PokemonFormType&gt;](PokemonFormType.md)
`triggerConditions` | [Array&lt;PokemonFormTriggerCondition&gt;](PokemonFormTriggerCondition.md)
`flavorTextEntries` | [Array&lt;PokemonFormFlavorText&gt;](PokemonFormFlavorText.md)

## Example

```typescript
import type { PokemonFormDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "order": null,
  "formOrder": null,
  "isDefault": null,
  "isBattleOnly": null,
  "isMega": null,
  "formName": null,
  "pokemon": null,
  "sprites": null,
  "versionGroup": null,
  "formNames": null,
  "names": null,
  "types": null,
  "triggerConditions": null,
  "flavorTextEntries": null,
} satisfies PokemonFormDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonFormDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


