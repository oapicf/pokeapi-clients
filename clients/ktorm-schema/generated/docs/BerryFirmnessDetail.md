
# Table `BerryFirmnessDetail`
(mapped from: BerryFirmnessDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**berries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerrySummary&gt;**](BerrySummary.md) | A list of the berries with this firmness. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFirmnessName&gt;**](BerryFirmnessName.md) | The name of this resource listed in different languages. |  [readonly]




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



