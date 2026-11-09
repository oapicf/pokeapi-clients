# WWW::OpenAPIClient::Object::GrowthRateDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GrowthRateDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**formula** | **string** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | [**ARRAY[GrowthRateDescription]**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 
**levels** | [**ARRAY[Experience]**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**pokemon_species** | [**ARRAY[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


