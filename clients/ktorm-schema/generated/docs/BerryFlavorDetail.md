
# Table `BerryFlavorDetail`
(mapped from: BerryFlavorDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**berries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFlavorDetailBerriesInner&gt;**](BerryFlavorDetailBerriesInner.md) |  | 
**contestType** | contest_type | long NOT NULL |  | [**ContestTypeSummary**](ContestTypeSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFlavorName&gt;**](BerryFlavorName.md) |  | 




# **Table `BerryFlavorDetailBerryFlavorDetailBerriesInner`**
(mapped from: BerryFlavorDetailBerryFlavorDetailBerriesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryFlavorDetail | berryFlavorDetail | long | | kotlin.Long | Primary Key | *one*
berryFlavorDetailBerriesInner | berryFlavorDetailBerriesInner | long | | kotlin.Long | Foreign Key | *many*




# **Table `BerryFlavorDetailBerryFlavorName`**
(mapped from: BerryFlavorDetailBerryFlavorName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryFlavorDetail | berryFlavorDetail | long | | kotlin.Long | Primary Key | *one*
berryFlavorName | berryFlavorName | long | | kotlin.Long | Foreign Key | *many*



