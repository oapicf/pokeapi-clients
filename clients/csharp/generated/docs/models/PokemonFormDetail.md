# Org.OpenAPITools.Model.PokemonFormDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**FormName** | **string** | The name of this form. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**Sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**FormNames** | [**List&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**Names** | [**List&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**Types** | [**List&lt;PokemonFormType&gt;**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] 
**TriggerConditions** | [**List&lt;PokemonFormTriggerCondition&gt;**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**FlavorTextEntries** | [**List&lt;PokemonFormFlavorText&gt;**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] 
**Order** | **int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] 
**FormOrder** | **int** | The order in which forms should be sorted within a species&#39; forms. | [optional] 
**IsDefault** | **bool** | True for exactly one form used as the default for each Pokémon. | [optional] 
**IsBattleOnly** | **bool** | Whether or not this form can only happen during battle. | [optional] 
**IsMega** | **bool** | Whether or not this form requires mega evolution. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

