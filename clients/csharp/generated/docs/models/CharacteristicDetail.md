# Org.OpenAPITools.Model.CharacteristicDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**GeneModulo** | **int** | The remainder of the highest stat/IV divided by 5. | 
**PossibleValues** | **List&lt;int&gt;** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**HighestStat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**Descriptions** | [**List&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

