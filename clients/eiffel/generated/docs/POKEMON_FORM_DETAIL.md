# POKEMON_FORM_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**order** | **INTEGER_32** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] [default to null]
**form_order** | **INTEGER_32** | The order in which forms should be sorted within a species&#39; forms. | [optional] [default to null]
**is_default** | **BOOLEAN** | True for exactly one form used as the default for each Pokémon. | [optional] [default to null]
**is_battle_only** | **BOOLEAN** | Whether or not this form can only happen during battle. | [optional] [default to null]
**is_mega** | **BOOLEAN** | Whether or not this form requires mega evolution. | [optional] [default to null]
**form_name** | [**STRING_32**](STRING_32.md) | The name of this form. | [default to null]
**pokemon** | [**POKEMON_SUMMARY**](PokemonSummary.md) | The Pokémon that can take on this form. | [default to null]
**sprites** | [**POKEMON_FORM_SPRITES**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] [default to null]
**version_group** | [**VERSION_GROUP_SUMMARY**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | [default to null]
**form_names** | [**LIST [POKEMON_FORM_NAME]**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to null]
**names** | [**LIST [POKEMON_FORM_NAME]**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to null]
**types** | [**LIST [POKEMON_FORM_TYPE]**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] [default to null]
**trigger_conditions** | [**LIST [POKEMON_FORM_TRIGGER_CONDITION]**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] [default to null]
**flavor_text_entries** | [**LIST [POKEMON_FORM_FLAVOR_TEXT]**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


