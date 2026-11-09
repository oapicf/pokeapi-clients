# PokeApiClient::LanguageDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **official** | **Boolean** | Whether or not the games are published in this language. | [optional] |
| **iso639** | **String** | The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. |  |
| **iso3166** | **String** | The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. |  |
| **names** | [**Array&lt;LanguageName&gt;**](LanguageName.md) | The name of this resource listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::LanguageDetail.new(
  id: null,
  name: null,
  official: null,
  iso639: null,
  iso3166: null,
  names: null
)
```

