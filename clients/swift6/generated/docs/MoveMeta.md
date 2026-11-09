# MoveMeta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**minHits** | **Int** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**maxHits** | **Int** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**minTurns** | **Int** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**maxTurns** | **Int** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**drain** | **Int** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] 
**healing** | **Int** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] 
**critRate** | **Int** | Critical hit rate bonus. | [optional] 
**ailmentChance** | **Int** | The likelihood this attack will cause an ailment. | [optional] 
**flinchChance** | **Int** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] 
**statChance** | **Int** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


