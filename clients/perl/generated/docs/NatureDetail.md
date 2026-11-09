# WWW::OpenAPIClient::Object::NatureDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::NatureDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**decreased_stat** | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | 
**increased_stat** | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | 
**likes_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | 
**hates_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | 
**pokeathlon_stat_changes** | [**ARRAY[NaturePokeathlonStat]**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**move_battle_style_preferences** | [**ARRAY[NatureBattleStylePreference]**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**names** | [**ARRAY[NatureName]**](NatureName.md) | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


