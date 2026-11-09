# PokeApiClient::TypeRelationships

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **no_damage_to** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types this type has no effect on. |  |
| **half_damage_to** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types this type is not very effect against. |  |
| **double_damage_to** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types this type is very effect against. |  |
| **no_damage_from** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that have no effect on this type. |  |
| **half_damage_from** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that are not very effective against this type. |  |
| **double_damage_from** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that are very effective against this type. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::TypeRelationships.new(
  no_damage_to: null,
  half_damage_to: null,
  double_damage_to: null,
  no_damage_from: null,
  half_damage_from: null,
  double_damage_from: null
)
```

