# PokeapiClient.VersionGroupDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**order** | **Number** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**moveLearnMethods** | [**[MoveLearnMethodSummary]**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [**[PokedexSummary]**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [**[RegionSummary]**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [**[VersionSummary]**](VersionSummary.md) | The versions this version group owns. | [readonly] 


