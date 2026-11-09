# PokeApiClient::AbilityEffectText

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **effect** | **String** | The localized effect text for an API resource in a specific language. |  |
| **short_effect** | **String** | The localized effect text in brief. |  |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language this effect is in. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::AbilityEffectText.new(
  effect: null,
  short_effect: null,
  language: null
)
```

