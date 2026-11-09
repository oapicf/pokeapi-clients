# NatureDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly]
**name** | **String** | The name for this resource. | 
**decreased_stat** | Option<[**models::StatSummary**](StatSummary.md)> | The stat decreased by 10% in Pokémon with this nature. | 
**increased_stat** | Option<[**models::StatSummary**](StatSummary.md)> | The stat increased by 10% in Pokémon with this nature. | 
**likes_flavor** | Option<[**models::BerryFlavorSummary**](BerryFlavorSummary.md)> | The flavor liked by Pokémon with this nature. | 
**hates_flavor** | Option<[**models::BerryFlavorSummary**](BerryFlavorSummary.md)> | The flavor hated by Pokémon with this nature. | 
**pokeathlon_stat_changes** | [**Vec<models::NaturePokeathlonStat>**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly]
**move_battle_style_preferences** | [**Vec<models::NatureBattleStylePreference>**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly]
**names** | [**Vec<models::NatureName>**](NatureName.md) | The name of this resource listed in different languages. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


