# PokeApiClient::MoveMetaCategoryDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **descriptions** | [**Array&lt;MoveMetaCategoryDescription&gt;**](MoveMetaCategoryDescription.md) |  | [readonly] |
| **moves** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |

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

