# BERRY_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**growth_time** | **INTEGER_32** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] [default to null]
**max_harvest** | **INTEGER_32** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] [default to null]
**natural_gift_power** | **INTEGER_32** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] [default to null]
**size** | **INTEGER_32** | The size of this Berry, in millimeters. | [optional] [default to null]
**smoothness** | **INTEGER_32** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] [default to null]
**soil_dryness** | **INTEGER_32** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] [default to null]
**firmness** | [**BERRY_FIRMNESS_SUMMARY**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | [default to null]
**flavors** | [**LIST [BERRY_FLAVOR_MAP]**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] [default to null]
**item** | [**ITEM_SUMMARY**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | [default to null]
**natural_gift_type** | [**TYPE_SUMMARY**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


