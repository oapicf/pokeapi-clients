# VersionGroupDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**order** | **Int** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] [default to null]
**generation** | [***GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | [default to null]
**moveLearnMethods** | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] [default to null]
**pokedexes** | [**PokedexSummary**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] [default to null]
**regions** | [**RegionSummary**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] [default to null]
**versions** | [**VersionSummary**](VersionSummary.md) | The versions this version group owns. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


