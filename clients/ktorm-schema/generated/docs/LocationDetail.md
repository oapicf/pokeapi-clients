
# Table `LocationDetail`
(mapped from: LocationDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**region** | region | long NOT NULL |  | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationName&gt;**](LocationName.md) | The name of this resource listed in different languages. |  [readonly]
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationGameIndex&gt;**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. |  [readonly]
**areas** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaSummary&gt;**](LocationAreaSummary.md) | Areas that can be found within this location. |  [readonly]





# **Table `LocationDetailLocationName`**
(mapped from: LocationDetailLocationName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationDetail | locationDetail | long | | kotlin.Long | Primary Key | *one*
locationName | locationName | long | | kotlin.Long | Foreign Key | *many*



# **Table `LocationDetailLocationGameIndex`**
(mapped from: LocationDetailLocationGameIndex)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationDetail | locationDetail | long | | kotlin.Long | Primary Key | *one*
locationGameIndex | locationGameIndex | long | | kotlin.Long | Foreign Key | *many*



# **Table `LocationDetailLocationAreaSummary`**
(mapped from: LocationDetailLocationAreaSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
locationDetail | locationDetail | long | | kotlin.Long | Primary Key | *one*
locationAreaSummary | locationAreaSummary | long | | kotlin.Long | Foreign Key | *many*



