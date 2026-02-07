# BerryDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**GrowthTime** | **Int32** |  | 
**MaxHarvest** | **Int32** |  | 
**NaturalGiftPower** | **Int32** |  | 
**Size** | **Int32** |  | 
**Smoothness** | **Int32** |  | 
**SoilDryness** | **Int32** |  | 
**Firmness** | [**BerryFirmnessSummary**](BerryFirmnessSummary.md) |  | 
**Flavors** | [**BerryDetailFlavorsInner[]**](BerryDetailFlavorsInner.md) |  | 
**Item** | [**ItemSummary**](ItemSummary.md) |  | 
**NaturalGiftType** | [**TypeSummary**](TypeSummary.md) |  | 

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

