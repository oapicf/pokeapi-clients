# PokeApiClient::PalParkAreaDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **names** | [**Array&lt;PalParkAreaName&gt;**](PalParkAreaName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_encounters** | [**Array&lt;PalParkEncounter&gt;**](PalParkEncounter.md) | A list of Pokémon encountered in thi pal park area along with details. | [readonly] |

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

