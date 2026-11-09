# nature_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**decreased_stat** | [**stat_summary_t**](stat_summary.md) \* | The stat decreased by 10% in Pokémon with this nature. | 
**increased_stat** | [**stat_summary_t**](stat_summary.md) \* | The stat increased by 10% in Pokémon with this nature. | 
**likes_flavor** | [**berry_flavor_summary_t**](berry_flavor_summary.md) \* | The flavor liked by Pokémon with this nature. | 
**hates_flavor** | [**berry_flavor_summary_t**](berry_flavor_summary.md) \* | The flavor hated by Pokémon with this nature. | 
**pokeathlon_stat_changes** | [**list_t**](nature_pokeathlon_stat.md) \* | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**move_battle_style_preferences** | [**list_t**](nature_battle_style_preference.md) \* | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**names** | [**list_t**](nature_name.md) \* | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


