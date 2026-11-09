# ContestTypeName
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name for this contest. | 
**Color** | **String** | The color associated with this contest&#39;s name. | 
**Language** | [**LanguageSummary**](LanguageSummary.md) | The language that this name is in. | 

## Examples

- Prepare the resource
```powershell
$ContestTypeName = Initialize-PSOpenAPIToolsContestTypeName  -Name null `
 -Color null `
 -Language null
```

- Convert the resource to JSON
```powershell
$ContestTypeName | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

