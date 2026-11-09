# MoveChange


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`accuracy`** | **`Int64`** | The percent value of how likely this move is to be successful. | [optional] [default to nothing]
**`power`** | **`Int64`** | The base power before the listed version group, or null if power did not change. | [optional] [default to nothing]
**`pp`** | **`Int64`** | Power points. The number of times this move can be used. | [optional] [default to nothing]
**`effect_chance`** | **`Int64`** | The percent value of how likely it is this moves effect will take effect. | [default to nothing]
**`effect_entries`** | [**`Vector{MoveEffectEffectText}`**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] [default to nothing]
**`type`** | [**`*TypeSummary`**](TypeSummary.md) | The elemental type of this move. | [default to nothing]
**`version_group`** | [**`*VersionGroupSummary`**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


