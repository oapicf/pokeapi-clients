# ItemAttributeDescription
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**Language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$ItemAttributeDescription = Initialize-PSOpenAPIToolsItemAttributeDescription  -Description null `
 -Language null
```

- Convert the resource to JSON
```powershell
$ItemAttributeDescription | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

