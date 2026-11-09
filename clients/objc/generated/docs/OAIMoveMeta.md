# OAIMoveMeta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**OAIMoveMetaAilmentSummary***](OAIMoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**OAIMoveMetaCategorySummary***](OAIMoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**minHits** | **NSNumber*** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**maxHits** | **NSNumber*** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**minTurns** | **NSNumber*** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**maxTurns** | **NSNumber*** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**drain** | **NSNumber*** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] 
**healing** | **NSNumber*** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] 
**critRate** | **NSNumber*** | Critical hit rate bonus. | [optional] 
**ailmentChance** | **NSNumber*** | The likelihood this attack will cause an ailment. | [optional] 
**flinchChance** | **NSNumber*** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] 
**statChance** | **NSNumber*** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


