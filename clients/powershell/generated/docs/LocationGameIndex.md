# LocationGameIndex
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GameIndex** | **Int32** | The internal id of an API resource within game data. | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation relevent to this game index. | 

## Examples

- Prepare the resource
```powershell
$LocationGameIndex = Initialize-PSOpenAPIToolsLocationGameIndex  -GameIndex null `
 -Generation null
```

- Convert the resource to JSON
```powershell
$LocationGameIndex | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

