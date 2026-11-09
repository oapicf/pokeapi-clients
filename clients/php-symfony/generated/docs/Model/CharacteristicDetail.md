# CharacteristicDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**geneModulo** | **int** | The remainder of the highest stat/IV divided by 5. | 
**possibleValues** | **int** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**highestStat** | [**OpenAPI\Server\Model\StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**descriptions** | [**OpenAPI\Server\Model\CharacteristicDescription**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


