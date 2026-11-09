# StatAffectingNatures
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | [**NatureSummary[]**](NatureSummary.md) | A list of natures and how they change the referenced stat. | 
**Decrease** | [**NatureSummary[]**](NatureSummary.md) | A list of nature sand how they change the referenced stat. | 

## Examples

- Prepare the resource
```powershell
$StatAffectingNatures = Initialize-PSOpenAPIToolsStatAffectingNatures  -Increase null `
 -Decrease null
```

- Convert the resource to JSON
```powershell
$StatAffectingNatures | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

