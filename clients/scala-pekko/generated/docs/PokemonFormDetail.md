

# PokemonFormDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. |  [readonly]
**name** | **String** | The name for this resource. | 
**order** | **Int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. |  [optional]
**formOrder** | **Int** | The order in which forms should be sorted within a species&#39; forms. |  [optional]
**isDefault** | **Boolean** | True for exactly one form used as the default for each Pokémon. |  [optional]
**isBattleOnly** | **Boolean** | Whether or not this form can only happen during battle. |  [optional]
**isMega** | **Boolean** | Whether or not this form requires mega evolution. |  [optional]
**formName** | **String** | The name of this form. | 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. |  [readonly]
**versionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**formNames** | [**Seq&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly]
**names** | [**Seq&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly]
**types** | [**Seq&lt;PokemonFormType&gt;**](PokemonFormType.md) | A list of details showing types this Pokémon form has. |  [readonly]
**triggerConditions** | [**Seq&lt;PokemonFormTriggerCondition&gt;**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. |  [readonly]
**flavorTextEntries** | [**Seq&lt;PokemonFormFlavorText&gt;**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. |  [readonly]



