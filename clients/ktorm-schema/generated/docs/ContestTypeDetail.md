
# Table `ContestTypeDetail`
(mapped from: ContestTypeDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**berryFlavor** | berry_flavor | long NOT NULL |  | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The berry flavor that correlates with this contest type. |  [readonly] [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ContestTypeName&gt;**](ContestTypeName.md) | The name of this contest type listed in different languages. |  [readonly]





# **Table `ContestTypeDetailContestTypeName`**
(mapped from: ContestTypeDetailContestTypeName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
contestTypeDetail | contestTypeDetail | long | | kotlin.Long | Primary Key | *one*
contestTypeName | contestTypeName | long | | kotlin.Long | Foreign Key | *many*



