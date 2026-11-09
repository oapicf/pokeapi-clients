# MoveMeta


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ailment`** | [**`*MoveMetaAilmentSummary`**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | [default to nothing]
**`category`** | [**`*MoveMetaCategorySummary`**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | [default to nothing]
**`min_hits`** | **`Int64`** | The minimum number of times this move hits. Null if it always only hits once. | [optional] [default to nothing]
**`max_hits`** | **`Int64`** | The maximum number of times this move hits. Null if it always only hits once. | [optional] [default to nothing]
**`min_turns`** | **`Int64`** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to nothing]
**`max_turns`** | **`Int64`** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] [default to nothing]
**`drain`** | **`Int64`** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] [default to nothing]
**`healing`** | **`Int64`** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] [default to nothing]
**`crit_rate`** | **`Int64`** | Critical hit rate bonus. | [optional] [default to nothing]
**`ailment_chance`** | **`Int64`** | The likelihood this attack will cause an ailment. | [optional] [default to nothing]
**`flinch_chance`** | **`Int64`** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] [default to nothing]
**`stat_chance`** | **`Int64`** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


