# PokeApiClient::MoveFlavorText

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **flavor_text** | **String** | The localized flavor text for an api resource in a specific language. |  |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that uses this flavor text. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveFlavorText.new(
  flavor_text: null,
  language: null,
  version_group: null
)
```

