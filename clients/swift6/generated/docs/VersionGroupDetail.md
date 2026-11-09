# VersionGroupDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**order** | **Int** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**moveLearnMethods** | [MoveLearnMethodSummary] | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [PokedexSummary] | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [RegionSummary] | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [VersionSummary] | The versions this version group owns. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


