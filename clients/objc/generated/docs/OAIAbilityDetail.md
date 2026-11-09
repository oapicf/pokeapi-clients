# OAIAbilityDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**isMainSeries** | **NSNumber*** | Whether or not this ability originated in the main series of the video games. | [optional] 
**generation** | [**OAIGenerationSummary***](OAIGenerationSummary.md) | The generation this ability originated in. | 
**names** | [**NSArray&lt;OAIAbilityName&gt;***](OAIAbilityName.md) | The name of this resource listed in different languages. | [readonly] 
**effectEntries** | [**NSArray&lt;OAIAbilityEffectText&gt;***](OAIAbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**effectChanges** | [**NSArray&lt;OAIAbilityChange&gt;***](OAIAbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] 
**flavorTextEntries** | [**NSArray&lt;OAIAbilityFlavorText&gt;***](OAIAbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**pokemon** | [**NSArray&lt;OAIAbilityPokemonDetail&gt;***](OAIAbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


