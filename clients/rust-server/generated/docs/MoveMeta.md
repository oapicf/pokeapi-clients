# MoveMeta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [***models::MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [***models::MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**min_hits** | **i32** | The minimum number of times this move hits. Null if it always only hits once. | [optional] [default to None]
**max_hits** | **i32** | The maximum number of times this move hits. Null if it always only hits once. | [optional] [default to None]
**min_turns** | **i32** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to None]
**max_turns** | **i32** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to None]
**drain** | **i32** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] [default to None]
**healing** | **i32** | The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP. | [optional] [default to None]
**crit_rate** | **i32** | Critical hit rate bonus. | [optional] [default to None]
**ailment_chance** | **i32** | The likelihood this attack will cause an ailment. | [optional] [default to None]
**flinch_chance** | **i32** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] [default to None]
**stat_chance** | **i32** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


