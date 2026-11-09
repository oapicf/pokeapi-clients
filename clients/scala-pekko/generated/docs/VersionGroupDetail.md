

# VersionGroupDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. |  [readonly]
**name** | **String** | The name for this resource. | 
**order** | **Int** | Order for sorting. Almost by date of release, except similar versions are grouped together. |  [optional]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this version was introduced in. | 
**moveLearnMethods** | [**Seq&lt;MoveLearnMethodSummary&gt;**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. |  [readonly]
**pokedexes** | [**Seq&lt;PokedexSummary&gt;**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. |  [readonly]
**regions** | [**Seq&lt;RegionSummary&gt;**](RegionSummary.md) | A list of regions that can be visited in this version group. |  [readonly]
**versions** | [**Seq&lt;VersionSummary&gt;**](VersionSummary.md) | The versions this version group owns. |  [readonly]



