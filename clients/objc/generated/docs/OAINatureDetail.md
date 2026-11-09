# OAINatureDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**decreasedStat** | [**OAIStatSummary***](OAIStatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | 
**increasedStat** | [**OAIStatSummary***](OAIStatSummary.md) | The stat increased by 10% in Pokémon with this nature. | 
**likesFlavor** | [**OAIBerryFlavorSummary***](OAIBerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | 
**hatesFlavor** | [**OAIBerryFlavorSummary***](OAIBerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | 
**pokeathlonStatChanges** | [**NSArray&lt;OAINaturePokeathlonStat&gt;***](OAINaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**moveBattleStylePreferences** | [**NSArray&lt;OAINatureBattleStylePreference&gt;***](OAINatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**names** | [**NSArray&lt;OAINatureName&gt;***](OAINatureName.md) | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


