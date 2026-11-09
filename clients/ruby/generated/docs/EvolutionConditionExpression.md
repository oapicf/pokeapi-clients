# PokeApiClient::EvolutionConditionExpression

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **expression** | **String** | Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;) |  |
| **percentage_chance** | **Float** | Percentage chance of evolution under this condition (0-100) |  |
| **variables** | [**Array&lt;EvolutionVariableSummary&gt;**](EvolutionVariableSummary.md) | Evolution variables referenced in the expression |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EvolutionConditionExpression.new(
  expression: null,
  percentage_chance: null,
  variables: null
)
```

