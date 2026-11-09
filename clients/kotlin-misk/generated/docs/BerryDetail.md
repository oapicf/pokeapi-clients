
# BerryDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | **kotlin.String** | The name for this resource. | 
**firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**flavors** | [**kotlin.collections.List&lt;BerryFlavorMap&gt;**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. |  [readonly]
**item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**naturalGiftType** | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | 
**growthTime** | **kotlin.Int** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. |  [optional]
**maxHarvest** | **kotlin.Int** | The maximum number of these berries that can grow on one tree in Generation IV. |  [optional]
**naturalGiftPower** | **kotlin.Int** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. |  [optional]
**propertySize** | **kotlin.Int** | The size of this Berry, in millimeters. |  [optional]
**smoothness** | **kotlin.Int** | The smoothness of this Berry, used in making Pokéblocks or Poffins. |  [optional]
**soilDryness** | **kotlin.Int** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. |  [optional]



