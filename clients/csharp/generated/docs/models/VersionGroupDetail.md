# Org.OpenAPITools.Model.VersionGroupDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**MoveLearnMethods** | [**List&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**Pokedexes** | [**List&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**Regions** | [**List&lt;RegionSummary&gt;**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**Versions** | [**List&lt;VersionSummary&gt;**](VersionSummary.md) | The versions this version group owns. | [readonly] 
**Order** | **int** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

