
# Table `ContestTypeDetail`
(mapped from: ContestTypeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**berryFlavor** | berry_flavor | long NOT NULL |  | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  |  [readonly] [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestTypeName&gt;**](ContestTypeName.md) |  | 





# **Table `ContestTypeDetailContestTypeName`**
(mapped from: ContestTypeDetailContestTypeName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
contestTypeDetail | contestTypeDetail | long | | kotlin.Long | Primary Key | *one*
contestTypeName | contestTypeName | long | | kotlin.Long | Foreign Key | *many*



