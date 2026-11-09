# PokeApiClient::CharacteristicDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **gene_modulo** | **Integer** | The remainder of the highest stat/IV divided by 5. |  |
| **possible_values** | **Array&lt;Integer&gt;** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] |
| **highest_stat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. |  |
| **descriptions** | [**Array&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] |

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

