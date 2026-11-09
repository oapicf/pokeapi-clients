# PokeApiClient::PokemonFormTriggerCondition

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **trigger** | **String** | The trigger for this form change. |  |
| **name** | **String** | The name of the required item, ability, or move. Only present for a resource-based trigger. | [optional] |
| **url** | **String** | The URL of the required item, ability, or move. Only present for a resource-based trigger. | [optional] |
| **base_form** | [**PokemonFormSummary**](PokemonFormSummary.md) | The required base form. Only present when the trigger specifies one. | [optional] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonFormTriggerCondition.new(
  trigger: null,
  name: null,
  url: null,
  base_form: null
)
```

