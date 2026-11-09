# NatureDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**decreasedStat** | [**OpenAPI\Server\Model\StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | 
**increasedStat** | [**OpenAPI\Server\Model\StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | 
**likesFlavor** | [**OpenAPI\Server\Model\BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | 
**hatesFlavor** | [**OpenAPI\Server\Model\BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | 
**pokeathlonStatChanges** | [**OpenAPI\Server\Model\NaturePokeathlonStat**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**moveBattleStylePreferences** | [**OpenAPI\Server\Model\NatureBattleStylePreference**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**names** | [**OpenAPI\Server\Model\NatureName**](NatureName.md) | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


