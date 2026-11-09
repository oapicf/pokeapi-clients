# PokemonFormDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**order** | **int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional]
**form_order** | **int** | The order in which forms should be sorted within a species&#39; forms. | [optional]
**is_default** | **bool** | True for exactly one form used as the default for each Pokémon. | [optional]
**is_battle_only** | **bool** | Whether or not this form can only happen during battle. | [optional]
**is_mega** | **bool** | Whether or not this form requires mega evolution. | [optional]
**form_name** | **string** | The name of this form. |
**pokemon** | [**\OpenAPI\Client\Model\PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. |
**sprites** | [**\OpenAPI\Client\Model\PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly]
**version_group** | [**\OpenAPI\Client\Model\VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. |
**form_names** | [**\OpenAPI\Client\Model\PokemonFormName[]**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly]
**names** | [**\OpenAPI\Client\Model\PokemonFormName[]**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly]
**types** | [**\OpenAPI\Client\Model\PokemonFormType[]**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly]
**trigger_conditions** | [**\OpenAPI\Client\Model\PokemonFormTriggerCondition[]**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly]
**flavor_text_entries** | [**\OpenAPI\Client\Model\PokemonFormFlavorText[]**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
