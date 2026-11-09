# openapi::MoveMeta


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**min_hits** | **integer** | The minimum number of times this move hits. Null if it always only hits once. | [optional] [Max: 2147483647] [Min: -2147483648] 
**max_hits** | **integer** | The maximum number of times this move hits. Null if it always only hits once. | [optional] [Max: 2147483647] [Min: -2147483648] 
**min_turns** | **integer** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [Max: 2147483647] [Min: -2147483648] 
**max_turns** | **integer** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [Max: 2147483647] [Min: -2147483648] 
**drain** | **integer** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] [Max: 2147483647] [Min: -2147483648] 
**healing** | **integer** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] [Max: 2147483647] [Min: -2147483648] 
**crit_rate** | **integer** | Critical hit rate bonus. | [optional] [Max: 2147483647] [Min: -2147483648] 
**ailment_chance** | **integer** | The likelihood this attack will cause an ailment. | [optional] [Max: 2147483647] [Min: -2147483648] 
**flinch_chance** | **integer** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] [Max: 2147483647] [Min: -2147483648] 
**stat_chance** | **integer** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] [Max: 2147483647] [Min: -2147483648] 


