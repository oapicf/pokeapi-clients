# MoveChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **i32** | The percent value of how likely this move is to be successful. | [optional] [default to None]
**power** | **i32** | The base power before the listed version group, or null if power did not change. | [optional] [default to None]
**pp** | **i32** | Power points. The number of times this move can be used. | [optional] [default to None]
**effect_chance** | **i32** | The percent value of how likely it is this moves effect will take effect. | 
**effect_entries** | [**Vec<models::MoveEffectEffectText>**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**r#type** | [***models::TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**version_group** | [***models::VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


