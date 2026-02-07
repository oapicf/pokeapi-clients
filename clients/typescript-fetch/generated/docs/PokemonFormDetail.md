
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
`sprites` | [PokemonFormDetailSprites](PokemonFormDetailSprites.md)
`versionGroup` | [VersionGroupSummary](VersionGroupSummary.md)
`formNames` | [Array&lt;PokemonFormDetailFormNamesInner&gt;](PokemonFormDetailFormNamesInner.md)
`names` | [Array&lt;PokemonFormDetailFormNamesInner&gt;](PokemonFormDetailFormNamesInner.md)
`types` | [Array&lt;PokemonDetailTypesInner&gt;](PokemonDetailTypesInner.md)

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


