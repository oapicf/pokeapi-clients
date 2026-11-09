# MoveMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**models::MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**models::MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**min_hits** | Option<**i32**> | The minimum number of times this move hits. Null if it always only hits once. | [optional]
**max_hits** | Option<**i32**> | The maximum number of times this move hits. Null if it always only hits once. | [optional]
**min_turns** | Option<**i32**> | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional]
**max_turns** | Option<**i32**> | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional]
**drain** | Option<**i32**> | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional]
**healing** | Option<**i32**> | The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP. | [optional]
**crit_rate** | Option<**i32**> | Critical hit rate bonus. | [optional]
**ailment_chance** | Option<**i32**> | The likelihood this attack will cause an ailment. | [optional]
**flinch_chance** | Option<**i32**> | The likelihood this attack will cause the target Pokémon to flinch. | [optional]
**stat_chance** | Option<**i32**> | The likelihood this attack will cause a stat change in the target Pokémon. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


