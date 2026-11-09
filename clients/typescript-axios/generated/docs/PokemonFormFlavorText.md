# PokemonFormFlavorText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **string** | The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;\&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781\&#39; &gt;issue&lt;/a&gt; to find out more.  | [default to undefined]
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | [default to undefined]
**version** | [**VersionSummary**](VersionSummary.md) | The game version this flavor text is extracted from. | [default to undefined]

## Example

```typescript
import { PokemonFormFlavorText } from './api';

const instance: PokemonFormFlavorText = {
    flavor_text,
    language,
    version,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
