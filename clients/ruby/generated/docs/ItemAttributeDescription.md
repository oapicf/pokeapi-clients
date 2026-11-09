# PokeApiClient::ItemAttributeDescription

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | The localized description for an API resource in a specific language. | [optional] |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemAttributeDescription.new(
  description: null,
  language: null
)
```

