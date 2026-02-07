
# Table `MoveChange`
(mapped from: MoveChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**effectChance** | effect_chance | int NOT NULL |  | **kotlin.Int** |  | 
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveChangeEffectEntriesInner&gt;**](MoveChangeEffectEntriesInner.md) |  | 
**type** | type | long NOT NULL |  | [**TypeSummary**](TypeSummary.md) |  |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  [foreignkey]
**accuracy** | accuracy | int |  | **kotlin.Int** |  |  [optional]
**power** | power | int |  | **kotlin.Int** |  |  [optional]
**pp** | pp | int |  | **kotlin.Int** |  |  [optional]



# **Table `MoveChangeMoveChangeEffectEntriesInner`**
(mapped from: MoveChangeMoveChangeEffectEntriesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveChange | moveChange | long | | kotlin.Long | Primary Key | *one*
moveChangeEffectEntriesInner | moveChangeEffectEntriesInner | long | | kotlin.Long | Foreign Key | *many*








