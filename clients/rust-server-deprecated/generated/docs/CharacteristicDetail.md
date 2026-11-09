# CharacteristicDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**gene_modulo** | **i32** | The remainder of the highest stat/IV divided by 5. | 
**possible_values** | **Vec<i32>** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**highest_stat** | [***models::StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**descriptions** | [**Vec<models::CharacteristicDescription>**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


