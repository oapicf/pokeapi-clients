

# PokemonFormDetail

The class is defined in **[PokemonFormDetail.java](../../src/main/java/org/openapitools/model/PokemonFormDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**order** | `Integer` | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. |  [optional property]
**formOrder** | `Integer` | The order in which forms should be sorted within a species&#39; forms. |  [optional property]
**isDefault** | `Boolean` | True for exactly one form used as the default for each Pokémon. |  [optional property]
**isBattleOnly** | `Boolean` | Whether or not this form can only happen during battle. |  [optional property]
**isMega** | `Boolean` | Whether or not this form requires mega evolution. |  [optional property]
**formName** | `String` | The name of this form. | 
**pokemon** | [`PokemonSummary`](PokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [`PokemonFormSprites`](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. |  [readonly property]
**versionGroup** | [`VersionGroupSummary`](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**formNames** | [`List&lt;PokemonFormName&gt;`](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly property]
**names** | [`List&lt;PokemonFormName&gt;`](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. |  [readonly property]
**types** | [`List&lt;PokemonFormType&gt;`](PokemonFormType.md) | A list of details showing types this Pokémon form has. |  [readonly property]
**triggerConditions** | [`List&lt;PokemonFormTriggerCondition&gt;`](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. |  [readonly property]
**flavorTextEntries** | [`List&lt;PokemonFormFlavorText&gt;`](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. |  [readonly property]


















