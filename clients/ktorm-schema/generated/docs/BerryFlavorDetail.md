
# Table `BerryFlavorDetail`
(mapped from: BerryFlavorDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**berries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFlavorBerryMap&gt;**](BerryFlavorBerryMap.md) | A list of the berries with this flavor. |  [readonly]
**contestType** | contest_type | long NOT NULL |  | [**ContestTypeSummary**](ContestTypeSummary.md) | The contest type that correlates with this berry flavor. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFlavorName&gt;**](BerryFlavorName.md) | The name of this resource listed in different languages. |  [readonly]




# **Table `BerryFlavorDetailBerryFlavorBerryMap`**
(mapped from: BerryFlavorDetailBerryFlavorBerryMap)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryFlavorDetail | berryFlavorDetail | long | | kotlin.Long | Primary Key | *one*
berryFlavorBerryMap | berryFlavorBerryMap | long | | kotlin.Long | Foreign Key | *many*




# **Table `BerryFlavorDetailBerryFlavorName`**
(mapped from: BerryFlavorDetailBerryFlavorName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryFlavorDetail | berryFlavorDetail | long | | kotlin.Long | Primary Key | *one*
berryFlavorName | berryFlavorName | long | | kotlin.Long | Foreign Key | *many*



