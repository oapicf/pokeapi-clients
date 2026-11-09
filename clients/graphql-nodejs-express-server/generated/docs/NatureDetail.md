# NatureDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**decreasedStat** | [***StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | [default to null]
**increasedStat** | [***StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | [default to null]
**likesFlavor** | [***BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | [default to null]
**hatesFlavor** | [***BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | [default to null]
**pokeathlonStatChanges** | [**NaturePokeathlonStat**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] [default to null]
**moveBattleStylePreferences** | [**NatureBattleStylePreference**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] [default to null]
**names** | [**NatureName**](NatureName.md) | The name of this resource listed in different languages. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


