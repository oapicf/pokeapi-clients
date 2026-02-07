
# Table `LocationDetail`
(mapped from: LocationDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**region** | region | long NOT NULL |  | [**RegionSummary**](RegionSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationName&gt;**](LocationName.md) |  | 
**gameIndices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationGameIndex&gt;**](LocationGameIndex.md) |  | 
**areas** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LocationAreaSummary&gt;**](LocationAreaSummary.md) |  | 





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



