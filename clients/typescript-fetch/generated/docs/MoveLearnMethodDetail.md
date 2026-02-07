
# MoveLearnMethodDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`names` | [Array&lt;MoveLearnMethodName&gt;](MoveLearnMethodName.md)
`descriptions` | [Array&lt;MoveLearnMethodDescription&gt;](MoveLearnMethodDescription.md)
`versionGroups` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)

## Example

```typescript
import type { MoveLearnMethodDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "names": null,
  "descriptions": null,
  "versionGroups": null,
} satisfies MoveLearnMethodDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MoveLearnMethodDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


