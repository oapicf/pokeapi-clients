# WWW::OpenAPIClient::Object::VersionGroupDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::VersionGroupDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**order** | **int** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**move_learn_methods** | [**ARRAY[MoveLearnMethodSummary]**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [**ARRAY[PokedexSummary]**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [**ARRAY[RegionSummary]**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [**ARRAY[VersionSummary]**](VersionSummary.md) | The versions this version group owns. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


