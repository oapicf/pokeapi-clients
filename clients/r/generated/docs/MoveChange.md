# openapi::MoveChange


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **integer** | The percent value of how likely this move is to be successful. | [optional] [Max: 2147483647] [Min: -2147483648] 
**power** | **integer** | The base power before the listed version group, or null if power did not change. | [optional] [Max: 2147483647] [Min: -2147483648] 
**pp** | **integer** | Power points. The number of times this move can be used. | [optional] [Max: 2147483647] [Min: -2147483648] 
**effect_chance** | **integer** | The percent value of how likely it is this moves effect will take effect. | 
**effect_entries** | [**array[MoveEffectEffectText]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | 


