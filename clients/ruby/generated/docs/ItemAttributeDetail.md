# PokeApiClient::ItemAttributeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **descriptions** | [**Array&lt;ItemAttributeDescription&gt;**](ItemAttributeDescription.md) |  | [readonly] |
| **items** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |
| **names** | [**Array&lt;ItemAttributeName&gt;**](ItemAttributeName.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemAttributeDetail.new(
  id: null,
  name: null,
  descriptions: null,
  items: null,
  names: null
)
```

