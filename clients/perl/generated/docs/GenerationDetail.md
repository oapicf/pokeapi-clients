# WWW::OpenAPIClient::Object::GenerationDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GenerationDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**abilities** | [**ARRAY[AbilitySummary]**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] 
**main_region** | [**RegionSummary**](RegionSummary.md) | The main region travelled in this generation. | 
**moves** | [**ARRAY[MoveSummary]**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] 
**names** | [**ARRAY[GenerationName]**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**ARRAY[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] 
**types** | [**ARRAY[TypeSummary]**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] 
**version_groups** | [**ARRAY[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


