
# VersionGroupDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The identifier for this resource. |  [readonly] |
| **name** | **kotlin.String** | The name for this resource. |  |
| **generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. |  |
| **moveLearnMethods** | [**kotlin.collections.List&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. |  [readonly] |
| **pokedexes** | [**kotlin.collections.List&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. |  [readonly] |
| **regions** | [**kotlin.collections.List&lt;RegionSummary&gt;**](RegionSummary.md) | A list of regions that can be visited in this version group. |  [readonly] |
| **versions** | [**kotlin.collections.List&lt;VersionSummary&gt;**](VersionSummary.md) | The versions this version group owns. |  [readonly] |
| **order** | **kotlin.Int** | Order for sorting. Almost by date of release, except similar versions are grouped together. |  [optional] |



