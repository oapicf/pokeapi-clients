# PokeApiClient::AbilityChange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  |
| **effect_entries** | [**Array&lt;AbilityChangeEffectText&gt;**](AbilityChangeEffectText.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::AbilityChange.new(
  version_group: null,
  effect_entries: null
)
```

