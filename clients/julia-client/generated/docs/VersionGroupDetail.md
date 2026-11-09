# VersionGroupDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`order`** | **`Int64`** | Order for sorting. Almost by date of release, except similar versions are grouped together. | [optional] [default to nothing]
**`generation`** | [**`*GenerationSummary`**](GenerationSummary.md) | The generation this version was introduced in. | [default to nothing]
**`move_learn_methods`** | [**`Vector{MoveLearnMethodSummary}`**](MoveLearnMethodSummary.md) | A list of methods in which Pokémon can learn moves in this version group. | [readonly] [default to nothing]
**`pokedexes`** | [**`Vector{PokedexSummary}`**](PokedexSummary.md) | A list of Pokédexes introduces in this version group. | [readonly] [default to nothing]
**`regions`** | [**`Vector{RegionSummary}`**](RegionSummary.md) | A list of regions that can be visited in this version group. | [readonly] [default to nothing]
**`versions`** | [**`Vector{VersionSummary}`**](VersionSummary.md) | The versions this version group owns. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


