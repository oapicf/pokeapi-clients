# BerryDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**GrowthTime** | **Int32** | Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. | [optional] 
**MaxHarvest** | **Int32** | The maximum number of these berries that can grow on one tree in Generation IV. | [optional] 
**NaturalGiftPower** | **Int32** | The power of the move &quot;&quot;Natural Gift&quot;&quot; when used with this Berry. | [optional] 
**Size** | **Int32** | The size of this Berry, in millimeters. | [optional] 
**Smoothness** | **Int32** | The smoothness of this Berry, used in making Pokéblocks or Poffins. | [optional] 
**SoilDryness** | **Int32** | The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. | [optional] 
**Firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) | The firmness of this berry, used in making Pokéblocks or Poffins. | 
**Flavors** | [**BerryFlavorMap[]**](BerryFlavorMap.md) | A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. | [readonly] 
**Item** | [**ItemSummary**](ItemSummary.md) | Berries are actually items. This is a reference to the item specific data for this berry. | 
**NaturalGiftType** | [**TypeSummary**](TypeSummary.md) | The type inherited by &quot;&quot;Natural Gift&quot;&quot; when used with this Berry. | 

## Examples

- Prepare the resource
```powershell
$BerryDetail = Initialize-PSOpenAPIToolsBerryDetail  -Id null `
 -Name null `
 -GrowthTime null `
 -MaxHarvest null `
 -NaturalGiftPower null `
 -Size null `
 -Smoothness null `
 -SoilDryness null `
 -Firmness null `
 -Flavors null `
 -Item null `
 -NaturalGiftType null
```

- Convert the resource to JSON
```powershell
$BerryDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

