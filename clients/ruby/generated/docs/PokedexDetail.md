# PokeApiClient::PokedexDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **is_main_series** | **Boolean** |  | [optional] |
| **descriptions** | [**Array&lt;PokedexDescription&gt;**](PokedexDescription.md) |  | [readonly] |
| **names** | [**Array&lt;PokedexName&gt;**](PokedexName.md) |  | [readonly] |
| **pokemon_entries** | [**Array&lt;PokedexDetailPokemonEntriesInner&gt;**](PokedexDetailPokemonEntriesInner.md) |  | [readonly] |
| **region** | [**RegionSummary**](RegionSummary.md) |  |  |
| **version_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokedexDetail.new(
  id: null,
  name: null,
  is_main_series: null,
  descriptions: null,
  names: null,
  pokemon_entries: null,
  region: null,
  version_groups: null
)
```

