# WWW::OpenAPIClient::Object::MoveChange

## Load the model package
```perl
use WWW::OpenAPIClient::Object::MoveChange;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **int** | The percent value of how likely this move is to be successful. | [optional] 
**power** | **int** | The base power before the listed version group, or null if power did not change. | [optional] 
**pp** | **int** | Power points. The number of times this move can be used. | [optional] 
**effect_chance** | **int** | The percent value of how likely it is this moves effect will take effect. | 
**effect_entries** | [**ARRAY[MoveEffectEffectText]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


