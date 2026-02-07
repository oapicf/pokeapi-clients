# PokeApiClient::PokeathlonStatDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **affecting_natures** | [**PokeathlonStatDetailAffectingNatures**](PokeathlonStatDetailAffectingNatures.md) |  |  |
| **names** | [**Array&lt;PokeathlonStatName&gt;**](PokeathlonStatName.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokeathlonStatDetail.new(
  id: null,
  name: null,
  affecting_natures: null,
  names: null
)
```

