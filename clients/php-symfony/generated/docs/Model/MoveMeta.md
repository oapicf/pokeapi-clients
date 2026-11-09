# MoveMeta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**OpenAPI\Server\Model\MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**OpenAPI\Server\Model\MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**minHits** | **int** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**maxHits** | **int** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**minTurns** | **int** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**maxTurns** | **int** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**drain** | **int** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] 
**healing** | **int** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] 
**critRate** | **int** | Critical hit rate bonus. | [optional] 
**ailmentChance** | **int** | The likelihood this attack will cause an ailment. | [optional] 
**flinchChance** | **int** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] 
**statChance** | **int** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


