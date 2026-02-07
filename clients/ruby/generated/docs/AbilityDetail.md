# PokeApiClient::AbilityDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **is_main_series** | **Boolean** |  | [optional] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) |  |  |
| **names** | [**Array&lt;AbilityName&gt;**](AbilityName.md) |  |  |
| **effect_entries** | [**Array&lt;AbilityEffectText&gt;**](AbilityEffectText.md) |  |  |
| **effect_changes** | [**Array&lt;AbilityChange&gt;**](AbilityChange.md) |  |  |
| **flavor_text_entries** | [**Array&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) |  |  |
| **pokemon** | [**Array&lt;AbilityDetailPokemonInner&gt;**](AbilityDetailPokemonInner.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::AbilityDetail.new(
  id: null,
  name: null,
  is_main_series: null,
  generation: null,
  names: null,
  effect_entries: null,
  effect_changes: null,
  flavor_text_entries: null,
  pokemon: null
)
```

