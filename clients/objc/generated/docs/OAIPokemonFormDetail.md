# OAIPokemonFormDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**order** | **NSNumber*** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] 
**formOrder** | **NSNumber*** | The order in which forms should be sorted within a species&#39; forms. | [optional] 
**isDefault** | **NSNumber*** | True for exactly one form used as the default for each Pokémon. | [optional] 
**isBattleOnly** | **NSNumber*** | Whether or not this form can only happen during battle. | [optional] 
**isMega** | **NSNumber*** | Whether or not this form requires mega evolution. | [optional] 
**formName** | **NSString*** | The name of this form. | 
**pokemon** | [**OAIPokemonSummary***](OAIPokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [**OAIPokemonFormSprites***](OAIPokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**versionGroup** | [**OAIVersionGroupSummary***](OAIVersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**formNames** | [**NSArray&lt;OAIPokemonFormName&gt;***](OAIPokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**names** | [**NSArray&lt;OAIPokemonFormName&gt;***](OAIPokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**types** | [**NSArray&lt;OAIPokemonFormType&gt;***](OAIPokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] 
**triggerConditions** | [**NSArray&lt;OAIPokemonFormTriggerCondition&gt;***](OAIPokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**flavorTextEntries** | [**NSArray&lt;OAIPokemonFormFlavorText&gt;***](OAIPokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


