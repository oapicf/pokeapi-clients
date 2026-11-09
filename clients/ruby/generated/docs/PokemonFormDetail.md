# PokeApiClient::PokemonFormDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **order** | **Integer** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] |
| **form_order** | **Integer** | The order in which forms should be sorted within a species&#39; forms. | [optional] |
| **is_default** | **Boolean** | True for exactly one form used as the default for each Pokémon. | [optional] |
| **is_battle_only** | **Boolean** | Whether or not this form can only happen during battle. | [optional] |
| **is_mega** | **Boolean** | Whether or not this form requires mega evolution. | [optional] |
| **form_name** | **String** | The name of this form. |  |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. |  |
| **sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. |  |
| **form_names** | [**Array&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] |
| **names** | [**Array&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] |
| **types** | [**Array&lt;PokemonFormType&gt;**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] |
| **trigger_conditions** | [**Array&lt;PokemonFormTriggerCondition&gt;**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] |
| **flavor_text_entries** | [**Array&lt;PokemonFormFlavorText&gt;**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonFormDetail.new(
  id: null,
  name: null,
  order: null,
  form_order: null,
  is_default: null,
  is_battle_only: null,
  is_mega: null,
  form_name: null,
  pokemon: null,
  sprites: null,
  version_group: null,
  form_names: null,
  names: null,
  types: null,
  trigger_conditions: null,
  flavor_text_entries: null
)
```

