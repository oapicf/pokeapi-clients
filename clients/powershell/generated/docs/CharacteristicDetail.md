# CharacteristicDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**GeneModulo** | **Int32** | The remainder of the highest stat/IV divided by 5. | 
**PossibleValues** | **Int32[]** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**HighestStat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**Descriptions** | [**CharacteristicDescription[]**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 

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

