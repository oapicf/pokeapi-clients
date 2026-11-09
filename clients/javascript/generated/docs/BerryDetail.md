# PokeapiClient.BerryDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**growthTime** | **Number** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] 
**maxHarvest** | **Number** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] 
**naturalGiftPower** | **Number** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] 
**size** | **Number** | The size of this Berry, in millimeters. | [optional] 
**smoothness** | **Number** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] 
**soilDryness** | **Number** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] 
**firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**flavors** | [**[BerryFlavorMap]**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] 
**item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**naturalGiftType** | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | 


