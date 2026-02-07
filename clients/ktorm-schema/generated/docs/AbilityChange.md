
# Table `AbilityChange`
(mapped from: AbilityChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  [foreignkey]
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityChangeEffectText&gt;**](AbilityChangeEffectText.md) |  | 



# **Table `AbilityChangeAbilityChangeEffectText`**
(mapped from: AbilityChangeAbilityChangeEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
abilityChange | abilityChange | long | | kotlin.Long | Primary Key | *one*
abilityChangeEffectText | abilityChangeEffectText | long | | kotlin.Long | Foreign Key | *many*



