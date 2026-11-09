# characteristic_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**gene_modulo** | **int** | The remainder of the highest stat/IV divided by 5. | 
**possible_values** | **list_t \*** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**highest_stat** | [**stat_summary_t**](stat_summary.md) \* | The stat which results in this characteristic. | 
**descriptions** | [**list_t**](characteristic_description.md) \* | The descriptions of this characteristic listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


