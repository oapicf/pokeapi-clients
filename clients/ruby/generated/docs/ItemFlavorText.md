# PokeApiClient::ItemFlavorText

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **text** | **String** | The localized flavor text for an API resource in a specific language. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group which uses this flavor text. |  |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemFlavorText.new(
  text: null,
  version_group: null,
  language: null
)
```

