# PokeApiClient::AbilityDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **is_main_series** | **Boolean** | Whether or not this ability originated in the main series of the video games. | [optional] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. |  |
| **names** | [**Array&lt;AbilityName&gt;**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] |
| **effect_entries** | [**Array&lt;AbilityEffectText&gt;**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] |
| **effect_changes** | [**Array&lt;AbilityChange&gt;**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] |
| **flavor_text_entries** | [**Array&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] |
| **pokemon** | [**Array&lt;AbilityPokemonDetail&gt;**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] |

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

