# PokeapiClient.MoveChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accuracy** | **Number** | The percent value of how likely this move is to be successful. | [optional] 
**power** | **Number** | The base power before the listed version group, or null if power did not change. | [optional] 
**pp** | **Number** | Power points. The number of times this move can be used. | [optional] 
**effectChance** | **Number** | The percent value of how likely it is this moves effect will take effect. | 
**effectEntries** | [**[MoveEffectEffectText]**](MoveEffectEffectText.md) | The effect of this move listed in different languages. | [readonly] 
**type** | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. | 
**versionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. | 


