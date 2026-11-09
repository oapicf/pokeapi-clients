# BerryDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`growth_time`** | **`Int64`** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] [default to nothing]
**`max_harvest`** | **`Int64`** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] [default to nothing]
**`natural_gift_power`** | **`Int64`** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] [default to nothing]
**`size`** | **`Int64`** | The size of this Berry, in millimeters. | [optional] [default to nothing]
**`smoothness`** | **`Int64`** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] [default to nothing]
**`soil_dryness`** | **`Int64`** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] [default to nothing]
**`firmness`** | [**`*BerryFirmnessSummary`**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | [default to nothing]
**`flavors`** | [**`Vector{BerryFlavorMap}`**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] [default to nothing]
**`item`** | [**`*ItemSummary`**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | [default to nothing]
**`natural_gift_type`** | [**`*TypeSummary`**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


