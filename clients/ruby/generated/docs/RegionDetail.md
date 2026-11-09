# PokeApiClient::RegionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **locations** | [**Array&lt;LocationSummary&gt;**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly] |
| **main_generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this region was introduced in. | [readonly] |
| **names** | [**Array&lt;RegionName&gt;**](RegionName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokedexes** | [**Array&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly] |
| **version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::RegionDetail.new(
  id: null,
  name: null,
  locations: null,
  main_generation: null,
  names: null,
  pokedexes: null,
  version_groups: null
)
```

