# Org.OpenAPITools.Model.BerryDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Flavors** | [**List&lt;BerryFlavorMap&gt;**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] 
**Item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**GrowthTime** | **int** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] 
**MaxHarvest** | **int** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] 
**NaturalGiftPower** | **int** | The power of the move \&quot;Natural Gift\&quot; when used with this Berry. | [optional] 
**Size** | **int** | The size of this Berry, in millimeters. | [optional] 
**Smoothness** | **int** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] 
**SoilDryness** | **int** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] 
**Firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**NaturalGiftType** | [**TypeSummary**](TypeSummary.md) | The type inherited by \&quot;Natural Gift\&quot; when used with this Berry. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

