# PokeApiClient::AbilityFlavorText

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **flavor_text** | **String** | The localized name for an API resource in a specific language. |  |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language this text resource is in. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that uses this flavor text. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::AbilityFlavorText.new(
  flavor_text: null,
  language: null,
  version_group: null
)
```

