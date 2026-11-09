# PokeapiClient.MoveMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**minHits** | **Number** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**maxHits** | **Number** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**minTurns** | **Number** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**maxTurns** | **Number** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**drain** | **Number** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] 
**healing** | **Number** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] 
**critRate** | **Number** | Critical hit rate bonus. | [optional] 
**ailmentChance** | **Number** | The likelihood this attack will cause an ailment. | [optional] 
**flinchChance** | **Number** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] 
**statChance** | **Number** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] 


