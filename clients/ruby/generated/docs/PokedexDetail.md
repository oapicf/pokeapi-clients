# PokeApiClient::PokedexDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **is_main_series** | **Boolean** | Whether or not this Pokédex originated in the main series of the video games. | [optional] |
| **descriptions** | [**Array&lt;PokedexDescription&gt;**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] |
| **names** | [**Array&lt;PokedexName&gt;**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_entries** | [**Array&lt;PokemonDexNumber&gt;**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] |
| **region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. |  |
| **version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] |

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

