# openapi::VersionGroupDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**order** | **integer** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] [Max: 2147483647] [Min: -2147483648] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**move_learn_methods** | [**array[MoveLearnMethodSummary]**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] 
**pokedexes** | [**array[PokedexSummary]**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] 
**regions** | [**array[RegionSummary]**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] 
**versions** | [**array[VersionSummary]**](VersionSummary.md) | The versions this version group owns. | [readonly] 


