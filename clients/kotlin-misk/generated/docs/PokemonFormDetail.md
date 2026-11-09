
# PokemonFormDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | **kotlin.String** | The name for this resource. | 
**formName** | **kotlin.String** | The name of this form. | 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. |  [readonly]
**versionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**formNames** | [**kotlin.collections.List&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly]
**names** | [**kotlin.collections.List&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly]
**types** | [**kotlin.collections.List&lt;PokemonFormType&gt;**](PokemonFormType.md) | A list of details showing types this Pokémon form has. |  [readonly]
**triggerConditions** | [**kotlin.collections.List&lt;PokemonFormTriggerCondition&gt;**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. |  [readonly]
**flavorTextEntries** | [**kotlin.collections.List&lt;PokemonFormFlavorText&gt;**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. |  [readonly]
**order** | **kotlin.Int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. |  [optional]
**formOrder** | **kotlin.Int** | The order in which forms should be sorted within a species&#39; forms. |  [optional]
**isDefault** | **kotlin.Boolean** | True for exactly one form used as the default for each Pokémon. |  [optional]
**isBattleOnly** | **kotlin.Boolean** | Whether or not this form can only happen during battle. |  [optional]
**isMega** | **kotlin.Boolean** | Whether or not this form requires mega evolution. |  [optional]



