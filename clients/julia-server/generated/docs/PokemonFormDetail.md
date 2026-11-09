# PokemonFormDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`order`** | **`Int64`** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] [default to nothing]
**`form_order`** | **`Int64`** | The order in which forms should be sorted within a species&#39; forms. | [optional] [default to nothing]
**`is_default`** | **`Bool`** | True for exactly one form used as the default for each Pokémon. | [optional] [default to nothing]
**`is_battle_only`** | **`Bool`** | Whether or not this form can only happen during battle. | [optional] [default to nothing]
**`is_mega`** | **`Bool`** | Whether or not this form requires mega evolution. | [optional] [default to nothing]
**`form_name`** | **`String`** | The name of this form. | [default to nothing]
**`pokemon`** | [**`*PokemonSummary`**](PokemonSummary.md) | The Pokémon that can take on this form. | [default to nothing]
**`sprites`** | [**`*PokemonFormSprites`**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] [default to nothing]
**`version_group`** | [**`*VersionGroupSummary`**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | [default to nothing]
**`form_names`** | [**`Vector{PokemonFormName}`**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to nothing]
**`names`** | [**`Vector{PokemonFormName}`**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to nothing]
**`types`** | [**`Vector{PokemonFormType}`**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] [default to nothing]
**`trigger_conditions`** | [**`Vector{PokemonFormTriggerCondition}`**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] [default to nothing]
**`flavor_text_entries`** | [**`Vector{PokemonFormFlavorText}`**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


