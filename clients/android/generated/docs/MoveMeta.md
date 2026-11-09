

# MoveMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**minHits** | **Integer** | The minimum number of times this move hits. Null if it always only hits once. |  [optional]
**maxHits** | **Integer** | The maximum number of times this move hits. Null if it always only hits once. |  [optional]
**minTurns** | **Integer** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. |  [optional]
**maxTurns** | **Integer** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. |  [optional]
**drain** | **Integer** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. |  [optional]
**healing** | **Integer** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. |  [optional]
**critRate** | **Integer** | Critical hit rate bonus. |  [optional]
**ailmentChance** | **Integer** | The likelihood this attack will cause an ailment. |  [optional]
**flinchChance** | **Integer** | The likelihood this attack will cause the target Pokémon to flinch. |  [optional]
**statChance** | **Integer** | The likelihood this attack will cause a stat change in the target Pokémon. |  [optional]




