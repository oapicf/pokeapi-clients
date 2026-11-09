
# Table `EncounterMethodDetail`
(mapped from: EncounterMethodDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EncounterMethodName&gt;**](EncounterMethodName.md) | The name of this resource listed in different languages. |  [readonly]
**order** | order | int |  | **kotlin.Int** | A good value for sorting. |  [optional]




# **Table `EncounterMethodDetailEncounterMethodName`**
(mapped from: EncounterMethodDetailEncounterMethodName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
encounterMethodDetail | encounterMethodDetail | long | | kotlin.Long | Primary Key | *one*
encounterMethodName | encounterMethodName | long | | kotlin.Long | Foreign Key | *many*




