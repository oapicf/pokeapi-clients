# PokeApiClient::PokeathlonStatDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **affecting_natures** | [**PokeathlonStatAffectingNatures**](PokeathlonStatAffectingNatures.md) | A detail of natures which affect this Pokéathlon stat positively or negatively. | [readonly] |
| **names** | [**Array&lt;PokeathlonStatName&gt;**](PokeathlonStatName.md) | The name of this resource listed in different languages. | [readonly] |

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

