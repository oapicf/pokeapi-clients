
# MoveMetaAilmentDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`moves` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)
`names` | [Array&lt;MoveMetaAilmentName&gt;](MoveMetaAilmentName.md)

## Example

```typescript
import type { MoveMetaAilmentDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "moves": null,
  "names": null,
} satisfies MoveMetaAilmentDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MoveMetaAilmentDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


