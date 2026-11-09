

# VersionGroupDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The identifier for this resource. |  [readonly]
**name** | **String** | The name for this resource. | 
**order** | **Integer** | Order for sorting. Almost by date of release, except similar versions are grouped together. |  [optional]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**moveLearnMethods** | [**List&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. |  [readonly]
**pokedexes** | [**List&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. |  [readonly]
**regions** | [**List&lt;RegionSummary&gt;**](RegionSummary.md) | A list of regions that can be visited in this version group. |  [readonly]
**versions** | [**List&lt;VersionSummary&gt;**](VersionSummary.md) | The versions this version group owns. |  [readonly]




