# PokemonFormDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly]
**name** | **String** | The name for this resource. | 
**order** | Option<**i32**> | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional]
**form_order** | Option<**i32**> | The order in which forms should be sorted within a species' forms. | [optional]
**is_default** | Option<**bool**> | True for exactly one form used as the default for each Pokémon. | [optional]
**is_battle_only** | Option<**bool**> | Whether or not this form can only happen during battle. | [optional]
**is_mega** | Option<**bool**> | Whether or not this form requires mega evolution. | [optional]
**form_name** | **String** | The name of this form. | 
**pokemon** | [**models::PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [**models::PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly]
**version_group** | [**models::VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**form_names** | [**Vec<models::PokemonFormName>**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly]
**names** | [**Vec<models::PokemonFormName>**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly]
**types** | [**Vec<models::PokemonFormType>**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly]
**trigger_conditions** | [**Vec<models::PokemonFormTriggerCondition>**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly]
**flavor_text_entries** | [**Vec<models::PokemonFormFlavorText>**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


