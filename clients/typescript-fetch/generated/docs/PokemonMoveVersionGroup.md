
# PokemonMoveVersionGroup


## Properties

Name | Type
------------ | -------------
`levelLearnedAt` | number
`moveLearnMethod` | [MoveLearnMethodSummary](MoveLearnMethodSummary.md)
`versionGroup` | [VersionGroupSummary](VersionGroupSummary.md)
`order` | number

## Example

```typescript
import type { PokemonMoveVersionGroup } from ''

// TODO: Update the object below with actual values
const example = {
  "levelLearnedAt": null,
  "moveLearnMethod": null,
  "versionGroup": null,
  "order": null,
} satisfies PokemonMoveVersionGroup

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonMoveVersionGroup
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


