# MOVE_META

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MOVE_META_AILMENT_SUMMARY**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | [default to null]
**category** | [**MOVE_META_CATEGORY_SUMMARY**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | [default to null]
**min_hits** | **INTEGER_32** | The minimum number of times this move hits. Null if it always only hits once. | [optional] [default to null]
**max_hits** | **INTEGER_32** | The maximum number of times this move hits. Null if it always only hits once. | [optional] [default to null]
**min_turns** | **INTEGER_32** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to null]
**max_turns** | **INTEGER_32** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to null]
**drain** | **INTEGER_32** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] [default to null]
**healing** | **INTEGER_32** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] [default to null]
**crit_rate** | **INTEGER_32** | Critical hit rate bonus. | [optional] [default to null]
**ailment_chance** | **INTEGER_32** | The likelihood this attack will cause an ailment. | [optional] [default to null]
**flinch_chance** | **INTEGER_32** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] [default to null]
**stat_chance** | **INTEGER_32** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


