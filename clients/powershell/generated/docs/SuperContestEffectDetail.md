# SuperContestEffectDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Appeal** | **Int32** |  | 
**FlavorTextEntries** | [**SuperContestEffectFlavorText[]**](SuperContestEffectFlavorText.md) |  | 
**Moves** | [**MoveSummary[]**](MoveSummary.md) |  | 

## Examples

- Prepare the resource
```powershell
$SuperContestEffectDetail = Initialize-PSOpenAPIToolsSuperContestEffectDetail  -Id null `
 -Appeal null `
 -FlavorTextEntries null `
 -Moves null
```

- Convert the resource to JSON
```powershell
$SuperContestEffectDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

