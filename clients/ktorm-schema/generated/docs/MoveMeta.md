
# Table `MoveMeta`
(mapped from: MoveMeta)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ailment** | ailment | long NOT NULL |  | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) |  |  [foreignkey]
**category** | category | long NOT NULL |  | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) |  |  [foreignkey]
**minHits** | min_hits | int |  | **kotlin.Int** |  |  [optional]
**maxHits** | max_hits | int |  | **kotlin.Int** |  |  [optional]
**minTurns** | min_turns | int |  | **kotlin.Int** |  |  [optional]
**maxTurns** | max_turns | int |  | **kotlin.Int** |  |  [optional]
**drain** | drain | int |  | **kotlin.Int** |  |  [optional]
**healing** | healing | int |  | **kotlin.Int** |  |  [optional]
**critRate** | crit_rate | int |  | **kotlin.Int** |  |  [optional]
**ailmentChance** | ailment_chance | int |  | **kotlin.Int** |  |  [optional]
**flinchChance** | flinch_chance | int |  | **kotlin.Int** |  |  [optional]
**statChance** | stat_chance | int |  | **kotlin.Int** |  |  [optional]














