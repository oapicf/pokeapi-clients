# OAIGrowthRateDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**formula** | **NSString*** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | [**NSArray&lt;OAIGrowthRateDescription&gt;***](OAIGrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 
**levels** | [**NSArray&lt;OAIExperience&gt;***](OAIExperience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**pokemonSpecies** | [**NSArray&lt;OAIPokemonSpeciesSummary&gt;***](OAIPokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


