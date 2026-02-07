# CharacteristicDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**GeneModulo** | **Int32** |  | 
**PossibleValues** | **Int32[]** |  | 
**HighestStat** | [**StatSummary**](StatSummary.md) |  | 
**Descriptions** | [**CharacteristicDescription[]**](CharacteristicDescription.md) |  | 

## Examples

- Prepare the resource
```powershell
$CharacteristicDetail = Initialize-PSOpenAPIToolsCharacteristicDetail  -Id null `
 -GeneModulo null `
 -PossibleValues null `
 -HighestStat null `
 -Descriptions null
```

- Convert the resource to JSON
```powershell
$CharacteristicDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

