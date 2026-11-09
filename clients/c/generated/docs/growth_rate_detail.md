# growth_rate_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**formula** | **char \*** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | [**list_t**](growth_rate_description.md) \* | The descriptions of this characteristic listed in different languages. | [readonly] 
**levels** | [**list_t**](experience.md) \* | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**pokemon_species** | [**list_t**](pokemon_species_summary.md) \* | A list of Pokémon species that gain levels at this growth rate. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


