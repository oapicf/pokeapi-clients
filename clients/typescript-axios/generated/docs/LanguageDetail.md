# LanguageDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**official** | **boolean** | Whether or not the games are published in this language. | [optional] [default to undefined]
**iso639** | **string** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. | [default to undefined]
**iso3166** | **string** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. | [default to undefined]
**names** | [**Array&lt;LanguageName&gt;**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { LanguageDetail } from './api';

const instance: LanguageDetail = {
    id,
    name,
    official,
    iso639,
    iso3166,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
