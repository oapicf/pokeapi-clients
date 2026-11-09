# PokemonFormDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**order** | **Int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] [default to null]
**formOrder** | **Int** | The order in which forms should be sorted within a species&#39; forms. | [optional] [default to null]
**isDefault** | **Boolean!** | True for exactly one form used as the default for each Pokémon. | [optional] [default to null]
**isBattleOnly** | **Boolean!** | Whether or not this form can only happen during battle. | [optional] [default to null]
**isMega** | **Boolean!** | Whether or not this form requires mega evolution. | [optional] [default to null]
**formName** | **String!** | The name of this form. | [default to null]
**pokemon** | [***PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | [default to null]
**sprites** | [***PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] [default to null]
**versionGroup** | [***VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | [default to null]
**formNames** | [**PokemonFormName**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to null]
**names** | [**PokemonFormName**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to null]
**types** | [**PokemonFormType**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] [default to null]
**triggerConditions** | [**PokemonFormTriggerCondition**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] [default to null]
**flavorTextEntries** | [**PokemonFormFlavorText**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


