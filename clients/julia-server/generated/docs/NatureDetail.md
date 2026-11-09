# NatureDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`decreased_stat`** | [**`*StatSummary`**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | [default to nothing]
**`increased_stat`** | [**`*StatSummary`**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | [default to nothing]
**`likes_flavor`** | [**`*BerryFlavorSummary`**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | [default to nothing]
**`hates_flavor`** | [**`*BerryFlavorSummary`**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | [default to nothing]
**`pokeathlon_stat_changes`** | [**`Vector{NaturePokeathlonStat}`**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] [default to nothing]
**`move_battle_style_preferences`** | [**`Vector{NatureBattleStylePreference}`**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] [default to nothing]
**`names`** | [**`Vector{NatureName}`**](NatureName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


