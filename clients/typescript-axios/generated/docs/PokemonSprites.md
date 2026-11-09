# PokemonSprites


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **string** | The default depiction of this Pokémon from the front in battle. | [default to undefined]
**front_shiny** | **string** | The shiny depiction of this Pokémon from the front in battle. | [default to undefined]
**front_female** | **string** | The female depiction of this Pokémon from the front in battle. | [default to undefined]
**front_shiny_female** | **string** | The shiny female depiction of this Pokémon from the front in battle. | [default to undefined]
**back_default** | **string** | The default depiction of this Pokémon from the back in battle. | [default to undefined]
**back_shiny** | **string** | The shiny depiction of this Pokémon from the back in battle. | [default to undefined]
**back_female** | **string** | The female depiction of this Pokémon from the back in battle. | [default to undefined]
**back_shiny_female** | **string** | The shiny female depiction of this Pokémon from the back in battle. | [default to undefined]
**other** | [**PokemonSpritesOther**](PokemonSpritesOther.md) | Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. | [optional] [default to undefined]
**versions** | **{ [key: string]: { [key: string]: any | null; }; }** | Sprites grouped by generation and game. Available keys vary by resource. | [optional] [default to undefined]

## Example

```typescript
import { PokemonSprites } from './api';

const instance: PokemonSprites = {
    front_default,
    front_shiny,
    front_female,
    front_shiny_female,
    back_default,
    back_shiny,
    back_female,
    back_shiny_female,
    other,
    versions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
