# PokemonFormDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **order** | **Integer** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] [default to null] |
| **form\_order** | **Integer** | The order in which forms should be sorted within a species&#39; forms. | [optional] [default to null] |
| **is\_default** | **Boolean** | True for exactly one form used as the default for each Pokémon. | [optional] [default to null] |
| **is\_battle\_only** | **Boolean** | Whether or not this form can only happen during battle. | [optional] [default to null] |
| **is\_mega** | **Boolean** | Whether or not this form requires mega evolution. | [optional] [default to null] |
| **form\_name** | **String** | The name of this form. | [default to null] |
| **pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | [default to null] |
| **sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [default to null] |
| **version\_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | [default to null] |
| **form\_names** | [**List**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [default to null] |
| **names** | [**List**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [default to null] |
| **types** | [**List**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [default to null] |
| **trigger\_conditions** | [**List**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [default to null] |
| **flavor\_text\_entries** | [**List**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

