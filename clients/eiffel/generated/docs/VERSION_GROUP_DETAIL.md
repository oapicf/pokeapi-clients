# VERSION_GROUP_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**order** | **INTEGER_32** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] [default to null]
**generation** | [**GENERATION_SUMMARY**](GenerationSummary.md) | The generation this version was introduced in. | [default to null]
**move_learn_methods** | [**LIST [MOVE_LEARN_METHOD_SUMMARY]**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] [default to null]
**pokedexes** | [**LIST [POKEDEX_SUMMARY]**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] [default to null]
**regions** | [**LIST [REGION_SUMMARY]**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] [default to null]
**versions** | [**LIST [VERSION_SUMMARY]**](VersionSummary.md) | The versions this version group owns. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


