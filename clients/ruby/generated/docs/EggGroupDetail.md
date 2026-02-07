# PokeApiClient::EggGroupDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **names** | [**Array&lt;EggGroupName&gt;**](EggGroupName.md) |  |  |
| **pokemon_species** | [**Array&lt;EggGroupDetailPokemonSpeciesInner&gt;**](EggGroupDetailPokemonSpeciesInner.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EggGroupDetail.new(
  id: null,
  name: null,
  names: null,
  pokemon_species: null
)
```

