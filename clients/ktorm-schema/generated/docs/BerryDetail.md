
# Table `BerryDetail`
(mapped from: BerryDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**firmness** | firmness | long NOT NULL |  | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. |  [foreignkey]
**flavors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryFlavorMap&gt;**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. |  [readonly]
**item** | item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. |  [foreignkey]
**naturalGiftType** | natural_gift_type | long NOT NULL |  | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. |  [foreignkey]
**growthTime** | growth_time | int |  | **kotlin.Int** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. |  [optional]
**maxHarvest** | max_harvest | int |  | **kotlin.Int** | The maximum number of these berries that can grow on one tree in Generation IV. |  [optional]
**naturalGiftPower** | natural_gift_power | int |  | **kotlin.Int** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. |  [optional]
**propertySize** | size | int |  | **kotlin.Int** | The size of this Berry, in millimeters. |  [optional]
**smoothness** | smoothness | int |  | **kotlin.Int** | The smoothness of this Berry, used in making Pokéblocks or Poffins. |  [optional]
**soilDryness** | soil_dryness | int |  | **kotlin.Int** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. |  [optional]





# **Table `BerryDetailBerryFlavorMap`**
(mapped from: BerryDetailBerryFlavorMap)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryDetail | berryDetail | long | | kotlin.Long | Primary Key | *one*
berryFlavorMap | berryFlavorMap | long | | kotlin.Long | Foreign Key | *many*











