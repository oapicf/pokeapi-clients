# MOVE_CHANGE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **INTEGER_32** | The percent value of how likely this move is to be successful. | [optional] [default to null]
**power** | **INTEGER_32** | The base power before the listed version group, or null if power did not change. | [optional] [default to null]
**pp** | **INTEGER_32** | Power points. The number of times this move can be used. | [optional] [default to null]
**effect_chance** | **INTEGER_32** | The percent value of how likely it is this moves effect will take effect. | [default to null]
**effect_entries** | [**LIST [MOVE_EFFECT_EFFECT_TEXT]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] [default to null]
**type** | [**TYPE_SUMMARY**](TypeSummary.md) | The elemental type of this move. | [default to null]
**version_group** | [**VERSION_GROUP_SUMMARY**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


