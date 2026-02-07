
# ItemAttributeDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`descriptions` | [Array&lt;ItemAttributeDescription&gt;](ItemAttributeDescription.md)
`items` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)
`names` | [Array&lt;ItemAttributeName&gt;](ItemAttributeName.md)

## Example

```typescript
import type { ItemAttributeDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "descriptions": null,
  "items": null,
  "names": null,
} satisfies ItemAttributeDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemAttributeDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


