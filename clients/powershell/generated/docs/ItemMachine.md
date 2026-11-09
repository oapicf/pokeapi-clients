# ItemMachine
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Machine** | [**MachineSummary**](MachineSummary.md) | The machine that teaches a move from an item. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group of this specific machine. | 

## Examples

- Prepare the resource
```powershell
$ItemMachine = Initialize-PSOpenAPIToolsItemMachine  -Machine null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$ItemMachine | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

