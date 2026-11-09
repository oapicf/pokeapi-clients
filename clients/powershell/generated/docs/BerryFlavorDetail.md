# BerryFlavorDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Berries** | [**BerryFlavorBerryMap[]**](BerryFlavorBerryMap.md) | A list of the berries with this flavor. | [readonly] 
**ContestType** | [**ContestTypeSummary**](ContestTypeSummary.md) | The contest type that correlates with this berry flavor. | 
**Names** | [**BerryFlavorName[]**](BerryFlavorName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$BerryFlavorDetail = Initialize-PSOpenAPIToolsBerryFlavorDetail  -Id null `
 -Name null `
 -Berries null `
 -ContestType null `
 -Names null
```

- Convert the resource to JSON
```powershell
$BerryFlavorDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

