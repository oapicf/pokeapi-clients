# VersionGroupDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **order** | **Integer** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] [default to null] |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | [default to null] |
| **move\_learn\_methods** | [**List**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [default to null] |
| **pokedexes** | [**List**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [default to null] |
| **regions** | [**List**](RegionSummary.md) | A list of regions that can be visited in this version group. | [default to null] |
| **versions** | [**List**](VersionSummary.md) | The versions this version group owns. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

