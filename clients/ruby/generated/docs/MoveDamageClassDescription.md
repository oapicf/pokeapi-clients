# PokeApiClient::MoveDamageClassDescription

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | The localized description for an API resource in a specific language. | [optional] |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveDamageClassDescription.new(
  description: null,
  language: null
)
```

