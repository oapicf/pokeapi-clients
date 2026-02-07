
# Table `EncounterConditionDetail`
(mapped from: EncounterConditionDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionValueSummary&gt;**](EncounterConditionValueSummary.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterConditionName&gt;**](EncounterConditionName.md) |  | 




# **Table `EncounterConditionDetailEncounterConditionValueSummary`**
(mapped from: EncounterConditionDetailEncounterConditionValueSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
encounterConditionDetail | encounterConditionDetail | long | | kotlin.Long | Primary Key | *one*
encounterConditionValueSummary | encounterConditionValueSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `EncounterConditionDetailEncounterConditionName`**
(mapped from: EncounterConditionDetailEncounterConditionName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
encounterConditionDetail | encounterConditionDetail | long | | kotlin.Long | Primary Key | *one*
encounterConditionName | encounterConditionName | long | | kotlin.Long | Foreign Key | *many*



