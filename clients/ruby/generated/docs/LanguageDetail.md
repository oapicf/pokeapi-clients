# PokeApiClient::LanguageDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **official** | **Boolean** |  | [optional] |
| **iso639** | **String** |  |  |
| **iso3166** | **String** |  |  |
| **names** | [**Array&lt;LanguageName&gt;**](LanguageName.md) |  |  |

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

