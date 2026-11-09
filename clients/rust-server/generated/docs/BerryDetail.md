# BerryDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**growth_time** | **i32** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] [default to None]
**max_harvest** | **i32** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] [default to None]
**natural_gift_power** | **i32** | The power of the move \"Natural Gift\" when used with this Berry. | [optional] [default to None]
**size** | **i32** | The size of this Berry, in millimeters. | [optional] [default to None]
**smoothness** | **i32** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] [default to None]
**soil_dryness** | **i32** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] [default to None]
**firmness** | [***models::BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**flavors** | [**Vec<models::BerryFlavorMap>**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] 
**item** | [***models::ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**natural_gift_type** | [***models::TypeSummary**](TypeSummary.md) | The type inherited by \"Natural Gift\" when used with this Berry. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


