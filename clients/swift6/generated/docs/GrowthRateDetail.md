# GrowthRateDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**formula** | **String** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | [GrowthRateDescription] | The descriptions of this characteristic listed in different languages. | [readonly] 
**levels** | [Experience] | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**pokemonSpecies** | [PokemonSpeciesSummary] | A list of Pokémon species that gain levels at this growth rate. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


