# OAIVersionGroupDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**order** | **NSNumber*** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**generation** | [**OAIGenerationSummary***](OAIGenerationSummary.md) | The generation this version was introduced in. | 
**moveLearnMethods** | [**NSArray&lt;OAIMoveLearnMethodSummary&gt;***](OAIMoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [**NSArray&lt;OAIPokedexSummary&gt;***](OAIPokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [**NSArray&lt;OAIRegionSummary&gt;***](OAIRegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [**NSArray&lt;OAIVersionSummary&gt;***](OAIVersionSummary.md) | The versions this version group owns. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


