# PokeApiClient::TypeGameSprite

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name_icon** | **String** | The URL of the icon displaying the type name in this game, or null if unavailable. | [optional] |
| **symbol_icon** | **String** | The URL of the type symbol icon in this game, or null if unavailable. | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::TypeGameSprite.new(
  name_icon: null,
  symbol_icon: null
)
```

