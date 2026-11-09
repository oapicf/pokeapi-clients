# openapi::BerryDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**growth_time** | **integer** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] [Max: 2147483647] [Min: -2147483648] 
**max_harvest** | **integer** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] [Max: 2147483647] [Min: -2147483648] 
**natural_gift_power** | **integer** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] [Max: 2147483647] [Min: -2147483648] 
**size** | **integer** | The size of this Berry, in millimeters. | [optional] [Max: 2147483647] [Min: -2147483648] 
**smoothness** | **integer** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] [Max: 2147483647] [Min: -2147483648] 
**soil_dryness** | **integer** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] [Max: 2147483647] [Min: -2147483648] 
**firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**flavors** | [**array[BerryFlavorMap]**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] 
**item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**natural_gift_type** | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | 


