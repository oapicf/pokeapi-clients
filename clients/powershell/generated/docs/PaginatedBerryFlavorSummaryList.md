# PaginatedBerryFlavorSummaryList
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **Int32** | The total number of resources available from this API. | 
**Next** | **String** | The URL for the next page in the list, or null if there is no next page. | [optional] 
**Previous** | **String** | The URL for the previous page in the list, or null if there is no previous page. | [optional] 
**Results** | [**BerryFlavorSummary[]**](BerryFlavorSummary.md) | A list of API resources on this page. | 

## Examples

- Prepare the resource
```powershell
$PaginatedBerryFlavorSummaryList = Initialize-PSOpenAPIToolsPaginatedBerryFlavorSummaryList  -Count 100 `
 -Next https://pokeapi.co/api/v2/berry-flavor/?offset&#x3D;40&amp;limit&#x3D;20 `
 -Previous https://pokeapi.co/api/v2/berry-flavor/?offset&#x3D;0&amp;limit&#x3D;20 `
 -Results null
```

- Convert the resource to JSON
```powershell
$PaginatedBerryFlavorSummaryList | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

