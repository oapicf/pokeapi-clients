# OAIBerryDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**growthTime** | **NSNumber*** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] 
**maxHarvest** | **NSNumber*** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] 
**naturalGiftPower** | **NSNumber*** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] 
**size** | **NSNumber*** | The size of this Berry, in millimeters. | [optional] 
**smoothness** | **NSNumber*** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] 
**soilDryness** | **NSNumber*** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] 
**firmness** | [**OAIBerryFirmnessSummary***](OAIBerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**flavors** | [**NSArray&lt;OAIBerryFlavorMap&gt;***](OAIBerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] 
**item** | [**OAIItemSummary***](OAIItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**naturalGiftType** | [**OAITypeSummary***](OAITypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


