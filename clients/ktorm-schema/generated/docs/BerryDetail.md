
# Table `BerryDetail`
(mapped from: BerryDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**growthTime** | growth_time | int NOT NULL |  | **kotlin.Int** |  | 
**maxHarvest** | max_harvest | int NOT NULL |  | **kotlin.Int** |  | 
**naturalGiftPower** | natural_gift_power | int NOT NULL |  | **kotlin.Int** |  | 
**propertySize** | size | int NOT NULL |  | **kotlin.Int** |  | 
**smoothness** | smoothness | int NOT NULL |  | **kotlin.Int** |  | 
**soilDryness** | soil_dryness | int NOT NULL |  | **kotlin.Int** |  | 
**firmness** | firmness | long NOT NULL |  | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) |  |  [foreignkey]
**flavors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BerryDetailFlavorsInner&gt;**](BerryDetailFlavorsInner.md) |  | 
**item** | item | long NOT NULL |  | [**ItemSummary**](ItemSummary.md) |  |  [foreignkey]
**naturalGiftType** | natural_gift_type | long NOT NULL |  | [**TypeSummary**](TypeSummary.md) |  |  [foreignkey]











# **Table `BerryDetailBerryDetailFlavorsInner`**
(mapped from: BerryDetailBerryDetailFlavorsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
berryDetail | berryDetail | long | | kotlin.Long | Primary Key | *one*
berryDetailFlavorsInner | berryDetailFlavorsInner | long | | kotlin.Long | Foreign Key | *many*





