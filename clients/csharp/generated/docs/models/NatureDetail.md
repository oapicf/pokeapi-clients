# Org.OpenAPITools.Model.NatureDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**PokeathlonStatChanges** | [**List&lt;NaturePokeathlonStat&gt;**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**MoveBattleStylePreferences** | [**List&lt;NatureBattleStylePreference&gt;**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**Names** | [**List&lt;NatureName&gt;**](NatureName.md) | The name of this resource listed in different languages. | [readonly] 
**DecreasedStat** | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | 
**IncreasedStat** | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | 
**LikesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | 
**HatesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

