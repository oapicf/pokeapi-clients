# Org.OpenAPITools.Model.MoveMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**Category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**MinHits** | **int** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**MaxHits** | **int** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**MinTurns** | **int** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**MaxTurns** | **int** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**Drain** | **int** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] 
**Healing** | **int** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] 
**CritRate** | **int** | Critical hit rate bonus. | [optional] 
**AilmentChance** | **int** | The likelihood this attack will cause an ailment. | [optional] 
**FlinchChance** | **int** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] 
**StatChance** | **int** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

