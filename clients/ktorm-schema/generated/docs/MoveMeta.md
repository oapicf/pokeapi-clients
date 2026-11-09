
# Table `MoveMeta`
(mapped from: MoveMeta)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ailment** | ailment | long NOT NULL |  | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. |  [foreignkey]
**category** | category | long NOT NULL |  | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. |  [foreignkey]
**minHits** | min_hits | int |  | **kotlin.Int** | The minimum number of times this move hits. Null if it always only hits once. |  [optional]
**maxHits** | max_hits | int |  | **kotlin.Int** | The maximum number of times this move hits. Null if it always only hits once. |  [optional]
**minTurns** | min_turns | int |  | **kotlin.Int** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. |  [optional]
**maxTurns** | max_turns | int |  | **kotlin.Int** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. |  [optional]
**drain** | drain | int |  | **kotlin.Int** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. |  [optional]
**healing** | healing | int |  | **kotlin.Int** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. |  [optional]
**critRate** | crit_rate | int |  | **kotlin.Int** | Critical hit rate bonus. |  [optional]
**ailmentChance** | ailment_chance | int |  | **kotlin.Int** | The likelihood this attack will cause an ailment. |  [optional]
**flinchChance** | flinch_chance | int |  | **kotlin.Int** | The likelihood this attack will cause the target Pokémon to flinch. |  [optional]
**statChance** | stat_chance | int |  | **kotlin.Int** | The likelihood this attack will cause a stat change in the target Pokémon. |  [optional]














