
# Table `EncounterMethodDetail`
(mapped from: EncounterMethodDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterMethodName&gt;**](EncounterMethodName.md) |  | 
**order** | order | int |  | **kotlin.Int** |  |  [optional]




# **Table `EncounterMethodDetailEncounterMethodName`**
(mapped from: EncounterMethodDetailEncounterMethodName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
encounterMethodDetail | encounterMethodDetail | long | | kotlin.Long | Primary Key | *one*
encounterMethodName | encounterMethodName | long | | kotlin.Long | Foreign Key | *many*




