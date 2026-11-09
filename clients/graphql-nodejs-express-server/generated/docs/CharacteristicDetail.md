# CharacteristicDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**geneModulo** | **Int!** | The remainder of the highest stat/IV divided by 5. | [default to null]
**possibleValues** | **Int!** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] [default to null]
**highestStat** | [***StatSummary**](StatSummary.md) | The stat which results in this characteristic. | [default to null]
**descriptions** | [**CharacteristicDescription**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


