# NatureDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**decreased_stat** | [**\OpenAPI\Client\Model\StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. |
**increased_stat** | [**\OpenAPI\Client\Model\StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. |
**likes_flavor** | [**\OpenAPI\Client\Model\BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. |
**hates_flavor** | [**\OpenAPI\Client\Model\BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. |
**pokeathlon_stat_changes** | [**\OpenAPI\Client\Model\NaturePokeathlonStat[]**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly]
**move_battle_style_preferences** | [**\OpenAPI\Client\Model\NatureBattleStylePreference[]**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly]
**names** | [**\OpenAPI\Client\Model\NatureName[]**](NatureName.md) | The name of this resource listed in different languages. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
