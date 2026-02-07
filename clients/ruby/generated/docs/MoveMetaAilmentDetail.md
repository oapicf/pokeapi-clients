# PokeApiClient::MoveMetaAilmentDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **moves** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  |  |
| **names** | [**Array&lt;MoveMetaAilmentName&gt;**](MoveMetaAilmentName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveMetaAilmentDetail.new(
  id: null,
  name: null,
  moves: null,
  names: null
)
```

