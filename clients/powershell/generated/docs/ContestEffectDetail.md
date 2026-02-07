# ContestEffectDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Appeal** | **Int32** |  | 
**Jam** | **Int32** |  | 
**EffectEntries** | [**ContestEffectEffectText[]**](ContestEffectEffectText.md) |  | 
**FlavorTextEntries** | [**ContestEffectFlavorText[]**](ContestEffectFlavorText.md) |  | 

## Examples

- Prepare the resource
```powershell
$ContestEffectDetail = Initialize-PSOpenAPIToolsContestEffectDetail  -Id null `
 -Appeal null `
 -Jam null `
 -EffectEntries null `
 -FlavorTextEntries null
```

- Convert the resource to JSON
```powershell
$ContestEffectDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

