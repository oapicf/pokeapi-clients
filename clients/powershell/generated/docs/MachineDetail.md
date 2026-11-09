# MachineDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Item** | [**ItemSummary**](ItemSummary.md) | The TM or HM item that corresponds to this machine. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that this machine applies to. | 
**Move** | [**MoveSummary**](MoveSummary.md) | The move that is taught by this machine. | 

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

