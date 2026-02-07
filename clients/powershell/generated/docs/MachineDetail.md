# MachineDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Item** | [**ItemSummary**](ItemSummary.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**Move** | [**MoveSummary**](MoveSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$MachineDetail = Initialize-PSOpenAPIToolsMachineDetail  -Id null `
 -Item null `
 -VersionGroup null `
 -Move null
```

- Convert the resource to JSON
```powershell
$MachineDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

