
# Table `MoveChange`
(mapped from: MoveChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**effectChance** | effect_chance | int NOT NULL |  | **kotlin.Int** | The percent value of how likely it is this moves effect will take effect. | 
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveEffectEffectText&gt;**](MoveEffectEffectText.md) | The effect of this move listed in different languages. |  [readonly]
**type** | type | long NOT NULL |  | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which these move stat values were in effect. |  [foreignkey]
**accuracy** | accuracy | int |  | **kotlin.Int** | The percent value of how likely this move is to be successful. |  [optional]
**power** | power | int |  | **kotlin.Int** | The base power before the listed version group, or null if power did not change. |  [optional]
**pp** | pp | int |  | **kotlin.Int** | Power points. The number of times this move can be used. |  [optional]



# **Table `MoveChangeMoveEffectEffectText`**
(mapped from: MoveChangeMoveEffectEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveChange | moveChange | long | | kotlin.Long | Primary Key | *one*
moveEffectEffectText | moveEffectEffectText | long | | kotlin.Long | Foreign Key | *many*








