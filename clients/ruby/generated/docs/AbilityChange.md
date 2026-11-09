# PokeApiClient::AbilityChange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the previous effect of this ability originated. |  |
| **effect_entries** | [**Array&lt;AbilityChangeEffectText&gt;**](AbilityChangeEffectText.md) | The previous effect of this ability listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::AbilityChange.new(
  version_group: null,
  effect_entries: null
)
```

