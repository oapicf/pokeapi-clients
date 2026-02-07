# PokeApiClient::PalParkAreaDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **names** | [**Array&lt;PalParkAreaName&gt;**](PalParkAreaName.md) |  |  |
| **pokemon_encounters** | [**Array&lt;PalParkAreaDetailPokemonEncountersInner&gt;**](PalParkAreaDetailPokemonEncountersInner.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PalParkAreaDetail.new(
  id: null,
  name: null,
  names: null,
  pokemon_encounters: null
)
```

