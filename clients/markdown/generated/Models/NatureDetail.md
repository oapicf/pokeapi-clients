# NatureDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **decreased\_stat** | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | [default to null] |
| **increased\_stat** | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | [default to null] |
| **likes\_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | [default to null] |
| **hates\_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | [default to null] |
| **pokeathlon\_stat\_changes** | [**List**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [default to null] |
| **move\_battle\_style\_preferences** | [**List**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [default to null] |
| **names** | [**List**](NatureName.md) | The name of this resource listed in different languages. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

