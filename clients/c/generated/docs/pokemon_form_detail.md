# pokemon_form_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**order** | **int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] 
**form_order** | **int** | The order in which forms should be sorted within a species&#39; forms. | [optional] 
**is_default** | **int** | True for exactly one form used as the default for each Pokémon. | [optional] 
**is_battle_only** | **int** | Whether or not this form can only happen during battle. | [optional] 
**is_mega** | **int** | Whether or not this form requires mega evolution. | [optional] 
**form_name** | **char \*** | The name of this form. | 
**pokemon** | [**pokemon_summary_t**](pokemon_summary.md) \* | The Pokémon that can take on this form. | 
**sprites** | [**pokemon_form_sprites_t**](pokemon_form_sprites.md) \* | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**version_group** | [**version_group_summary_t**](version_group_summary.md) \* | The version group this Pokémon form was introduced in. | 
**form_names** | [**list_t**](pokemon_form_name.md) \* | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**names** | [**list_t**](pokemon_form_name.md) \* | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**types** | [**list_t**](pokemon_form_type.md) \* | A list of details showing types this Pokémon form has. | [readonly] 
**trigger_conditions** | [**list_t**](pokemon_form_trigger_condition.md) \* | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**flavor_text_entries** | [**list_t**](pokemon_form_flavor_text.md) \* | The flavor text of this form listed in different languages and versions. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


