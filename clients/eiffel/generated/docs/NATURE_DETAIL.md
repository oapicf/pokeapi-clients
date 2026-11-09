# NATURE_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**decreased_stat** | [**STAT_SUMMARY**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | [default to null]
**increased_stat** | [**STAT_SUMMARY**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | [default to null]
**likes_flavor** | [**BERRY_FLAVOR_SUMMARY**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | [default to null]
**hates_flavor** | [**BERRY_FLAVOR_SUMMARY**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | [default to null]
**pokeathlon_stat_changes** | [**LIST [NATURE_POKEATHLON_STAT]**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] [default to null]
**move_battle_style_preferences** | [**LIST [NATURE_BATTLE_STYLE_PREFERENCE]**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] [default to null]
**names** | [**LIST [NATURE_NAME]**](NatureName.md) | The name of this resource listed in different languages. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


