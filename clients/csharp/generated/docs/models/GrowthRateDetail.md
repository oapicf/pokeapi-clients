# Org.OpenAPITools.Model.GrowthRateDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Formula** | **string** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**Descriptions** | [**List&lt;GrowthRateDescription&gt;**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 
**Levels** | [**List&lt;Experience&gt;**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**PokemonSpecies** | [**List&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

