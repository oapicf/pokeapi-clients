# SuperContestEffectDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Appeal** | **Int32** | The level of appeal this super contest effect has. | 
**FlavorTextEntries** | [**SuperContestEffectFlavorText[]**](SuperContestEffectFlavorText.md) | The flavor text of this super contest effect listed in different languages. | [readonly] 
**Moves** | [**MoveSummary[]**](MoveSummary.md) | A list of moves that have the effect when used in super contests. | [readonly] 

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

