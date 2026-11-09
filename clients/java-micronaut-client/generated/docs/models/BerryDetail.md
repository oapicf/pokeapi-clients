

# BerryDetail

The class is defined in **[BerryDetail.java](../../src/main/java/org/openapitools/model/BerryDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**growthTime** | `Integer` | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. |  [optional property]
**maxHarvest** | `Integer` | The maximum number of these berries that can grow on one tree in Generation IV. |  [optional property]
**naturalGiftPower** | `Integer` | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. |  [optional property]
**size** | `Integer` | The size of this Berry, in millimeters. |  [optional property]
**smoothness** | `Integer` | The smoothness of this Berry, used in making Pokéblocks or Poffins. |  [optional property]
**soilDryness** | `Integer` | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. |  [optional property]
**firmness** | [`BerryFirmnessSummary`](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**flavors** | [`List&lt;BerryFlavorMap&gt;`](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. |  [readonly property]
**item** | [`ItemSummary`](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**naturalGiftType** | [`TypeSummary`](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | 














