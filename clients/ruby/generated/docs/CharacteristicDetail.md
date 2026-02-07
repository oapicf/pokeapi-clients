# PokeApiClient::CharacteristicDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **gene_modulo** | **Integer** |  |  |
| **possible_values** | **Array&lt;Integer&gt;** |  |  |
| **highest_stat** | [**StatSummary**](StatSummary.md) |  |  |
| **descriptions** | [**Array&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::CharacteristicDetail.new(
  id: null,
  gene_modulo: null,
  possible_values: null,
  highest_stat: null,
  descriptions: null
)
```

