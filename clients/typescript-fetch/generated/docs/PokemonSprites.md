
# PokemonSprites


## Properties

Name | Type
------------ | -------------
`frontDefault` | string
`frontShiny` | string
`frontFemale` | string
`frontShinyFemale` | string
`backDefault` | string
`backShiny` | string
`backFemale` | string
`backShinyFemale` | string
`other` | [PokemonSpritesOther](PokemonSpritesOther.md)
`versions` | { [key: string]: { [key: string]: any | null; }; }

## Example

```typescript
import type { PokemonSprites } from ''

// TODO: Update the object below with actual values
const example = {
  "frontDefault": null,
  "frontShiny": null,
  "frontFemale": null,
  "frontShinyFemale": null,
  "backDefault": null,
  "backShiny": null,
  "backFemale": null,
  "backShinyFemale": null,
  "other": null,
  "versions": null,
} satisfies PokemonSprites

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PokemonSprites
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


