# PokemonSpritesOtherOfficialArtwork


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**front_default** | **string** | The URL of the default front official artwork, or null if unavailable. | [default to undefined]
**front_shiny** | **string** | The URL of the shiny front official artwork, or null if unavailable. | [default to undefined]
**versions** | **{ [key: string]: { [key: string]: any | null; }; }** | Additional official artwork grouped by version. Available keys vary by resource. | [optional] [default to undefined]

## Example

```typescript
import { PokemonSpritesOtherOfficialArtwork } from './api';

const instance: PokemonSpritesOtherOfficialArtwork = {
    front_default,
    front_shiny,
    versions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
