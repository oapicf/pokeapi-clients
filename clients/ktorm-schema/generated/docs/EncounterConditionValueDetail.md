
# Table `EncounterConditionValueDetail`
(mapped from: EncounterConditionValueDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**condition** | condition | long NOT NULL |  | [**EncounterConditionSummary**](EncounterConditionSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionValueName&gt;**](EncounterConditionValueName.md) |  | 





# **Table `EncounterConditionValueDetailEncounterConditionValueName`**
(mapped from: EncounterConditionValueDetailEncounterConditionValueName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
encounterConditionValueDetail | encounterConditionValueDetail | long | | kotlin.Long | Primary Key | *one*
encounterConditionValueName | encounterConditionValueName | long | | kotlin.Long | Foreign Key | *many*



