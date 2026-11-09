# PokeApiClient::ContestTypeName

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name for this contest. |  |
| **color** | **String** | The color associated with this contest&#39;s name. |  |
| **language** | [**LanguageSummary**](LanguageSummary.md) | The language that this name is in. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ContestTypeName.new(
  name: null,
  color: null,
  language: null
)
```

