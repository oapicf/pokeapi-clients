# move_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**accuracy** | **int** | The percent value of how likely this move is to be successful. | [optional] 
**effect_chance** | **int** | The percent value of how likely it is this moves effect will happen. | 
**pp** | **int** | Power points. The number of times this move can be used. | [optional] 
**priority** | **int** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. | [optional] 
**power** | **int** | The base power of this move, or null if it has no fixed base power. | [optional] 
**contest_combos** | [**move_combos_t**](move_combos.md) \* | A detail of normal and super contest combos that require this move. | [readonly] 
**contest_type** | [**contest_type_summary_t**](contest_type_summary.md) \* | The type of appeal this move gives a Pokémon when used in a contest. | 
**contest_effect** | [**contest_effect_summary_t**](contest_effect_summary.md) \* | The effect the move has when used in a contest. | 
**damage_class** | [**move_damage_class_summary_t**](move_damage_class_summary.md) \* | The type of damage the move inflicts on the target, e.g. physical. | 
**effect_entries** | [**list_t**](move_effect_effect_text.md) \* | The effect of this move listed in different languages. | [readonly] 
**effect_changes** | [**list_t**](move_effect_change.md) \* | The list of previous effects this move has had across version groups of the games. | [readonly] 
**generation** | [**generation_summary_t**](generation_summary.md) \* | The generation in which this move was introduced. | 
**meta** | [**move_meta_t**](move_meta.md) \* | Metadata about this move | [readonly] 
**names** | [**list_t**](move_name.md) \* | The name of this resource listed in different languages. | [readonly] 
**past_values** | [**list_t**](move_change.md) \* | A list of move resource value changes across version groups of the game. | [readonly] 
**stat_changes** | [**list_t**](move_meta_stat_change.md) \* | A list of stats this moves effects and how much it effects them. | [readonly] 
**super_contest_effect** | [**super_contest_effect_summary_t**](super_contest_effect_summary.md) \* | The effect the move has when used in a super contest. | 
**target** | [**move_target_summary_t**](move_target_summary.md) \* | The type of target that will receive the effects of the attack. | 
**type** | [**type_summary_t**](type_summary.md) \* | The elemental type of this move. | 
**machines** | [**list_t**](item_machine.md) \* | A list of the machines that teach this move. | [readonly] 
**flavor_text_entries** | [**list_t**](move_flavor_text.md) \* | The flavor text of this move listed in different languages. | [readonly] 
**learned_by_pokemon** | [**list_t**](pokemon_summary.md) \* | List of Pokemon that can learn the move | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


