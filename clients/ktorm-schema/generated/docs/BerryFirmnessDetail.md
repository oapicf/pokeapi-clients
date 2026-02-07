
# Table `BerryFirmnessDetail`
(mapped from: BerryFirmnessDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**berries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerrySummary&gt;**](BerrySummary.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFirmnessName&gt;**](BerryFirmnessName.md) |  | 




# **Table `BerryFirmnessDetailBerrySummary`**
(mapped from: BerryFirmnessDetailBerrySummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryFirmnessDetail | berryFirmnessDetail | long | | kotlin.Long | Primary Key | *one*
berrySummary | berrySummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `BerryFirmnessDetailBerryFirmnessName`**
(mapped from: BerryFirmnessDetailBerryFirmnessName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryFirmnessDetail | berryFirmnessDetail | long | | kotlin.Long | Primary Key | *one*
berryFirmnessName | berryFirmnessName | long | | kotlin.Long | Foreign Key | *many*



