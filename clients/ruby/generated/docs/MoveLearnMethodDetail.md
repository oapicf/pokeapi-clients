# PokeApiClient::MoveLearnMethodDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **names** | [**Array&lt;MoveLearnMethodName&gt;**](MoveLearnMethodName.md) |  | [readonly] |
| **descriptions** | [**Array&lt;MoveLearnMethodDescription&gt;**](MoveLearnMethodDescription.md) |  | [readonly] |
| **version_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveLearnMethodDetail.new(
  id: null,
  name: null,
  names: null,
  descriptions: null,
  version_groups: null
)
```

