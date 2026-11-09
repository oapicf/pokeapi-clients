# NatureDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**decreasedStat** | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | 
**increasedStat** | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | 
**likesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | 
**hatesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | 
**pokeathlonStatChanges** | [NaturePokeathlonStat] | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**moveBattleStylePreferences** | [NatureBattleStylePreference] | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**names** | [NatureName] | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


