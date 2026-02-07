# PokeApiClient::PokemonFormDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **order** | **Integer** |  | [optional] |
| **form_order** | **Integer** |  | [optional] |
| **is_default** | **Boolean** |  | [optional] |
| **is_battle_only** | **Boolean** |  | [optional] |
| **is_mega** | **Boolean** |  | [optional] |
| **form_name** | **String** |  |  |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) |  |  |
| **sprites** | [**PokemonFormDetailSprites**](PokemonFormDetailSprites.md) |  |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  |
| **form_names** | [**Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  |  |
| **names** | [**Array&lt;PokemonFormDetailFormNamesInner&gt;**](PokemonFormDetailFormNamesInner.md) |  |  |
| **types** | [**Array&lt;PokemonDetailTypesInner&gt;**](PokemonDetailTypesInner.md) |  |  |

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
  types: null
)
```

