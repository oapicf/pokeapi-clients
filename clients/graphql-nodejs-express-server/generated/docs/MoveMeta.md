# MoveMeta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [***MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | [default to null]
**category** | [***MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | [default to null]
**minHits** | **Int** | The minimum number of times this move hits. Null if it always only hits once. | [optional] [default to null]
**maxHits** | **Int** | The maximum number of times this move hits. Null if it always only hits once. | [optional] [default to null]
**minTurns** | **Int** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to null]
**maxTurns** | **Int** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to null]
**drain** | **Int** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] [default to null]
**healing** | **Int** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] [default to null]
**critRate** | **Int** | Critical hit rate bonus. | [optional] [default to null]
**ailmentChance** | **Int** | The likelihood this attack will cause an ailment. | [optional] [default to null]
**flinchChance** | **Int** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] [default to null]
**statChance** | **Int** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


