# ContestEffectDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Appeal** | **Int32** | The base number of hearts the user of this move gets. | 
**Jam** | **Int32** | The base number of hearts the user&#39;s opponent loses. | 
**EffectEntries** | [**ContestEffectEffectText[]**](ContestEffectEffectText.md) | The result of this contest effect listed in different languages. | [readonly] 
**FlavorTextEntries** | [**ContestEffectFlavorText[]**](ContestEffectFlavorText.md) | The flavor text of this contest effect listed in different languages. | [readonly] 

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

