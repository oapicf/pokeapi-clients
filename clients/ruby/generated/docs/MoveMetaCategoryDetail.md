# PokeApiClient::MoveMetaCategoryDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **descriptions** | [**Array&lt;MoveMetaCategoryDescription&gt;**](MoveMetaCategoryDescription.md) |  |  |
| **moves** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveMetaCategoryDetail.new(
  id: null,
  name: null,
  descriptions: null,
  moves: null
)
```

