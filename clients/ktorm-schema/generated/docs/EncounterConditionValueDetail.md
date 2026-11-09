
# Table `EncounterConditionValueDetail`
(mapped from: EncounterConditionValueDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**condition** | condition | long NOT NULL |  | [**EncounterConditionSummary**](EncounterConditionSummary.md) | The condition this encounter condition value pertains to. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionValueName&gt;**](EncounterConditionValueName.md) | The name of this resource listed in different languages. |  [readonly]





# **Table `EncounterConditionValueDetailEncounterConditionValueName`**
(mapped from: EncounterConditionValueDetailEncounterConditionValueName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
encounterConditionValueDetail | encounterConditionValueDetail | long | | kotlin.Long | Primary Key | *one*
encounterConditionValueName | encounterConditionValueName | long | | kotlin.Long | Foreign Key | *many*



