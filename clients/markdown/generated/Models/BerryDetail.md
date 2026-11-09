# BerryDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **growth\_time** | **Integer** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] [default to null] |
| **max\_harvest** | **Integer** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] [default to null] |
| **natural\_gift\_power** | **Integer** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] [default to null] |
| **size** | **Integer** | The size of this Berry, in millimeters. | [optional] [default to null] |
| **smoothness** | **Integer** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] [default to null] |
| **soil\_dryness** | **Integer** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] [default to null] |
| **firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | [default to null] |
| **flavors** | [**List**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [default to null] |
| **item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | [default to null] |
| **natural\_gift\_type** | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

