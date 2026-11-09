
# Table `MoveEffectChange`
(mapped from: MoveEffectChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the previous effect of this ability originated. |  [foreignkey]
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveEffectChangeEffectText&gt;**](MoveEffectChangeEffectText.md) | The previous effect of this ability listed in different languages. |  [readonly]



# **Table `MoveEffectChangeMoveEffectChangeEffectText`**
(mapped from: MoveEffectChangeMoveEffectChangeEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveEffectChange | moveEffectChange | long | | kotlin.Long | Primary Key | *one*
moveEffectChangeEffectText | moveEffectChangeEffectText | long | | kotlin.Long | Foreign Key | *many*



