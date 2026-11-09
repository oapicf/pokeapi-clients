# VersionGroupDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**order** | **i32** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] [default to None]
**generation** | [***models::GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**move_learn_methods** | [**Vec<models::MoveLearnMethodSummary>**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [**Vec<models::PokedexSummary>**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [**Vec<models::RegionSummary>**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [**Vec<models::VersionSummary>**](VersionSummary.md) | The versions this version group owns. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


