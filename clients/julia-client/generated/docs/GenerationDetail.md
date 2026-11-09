# GenerationDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`abilities`** | [**`Vector{AbilitySummary}`**](AbilitySummary.md) | A list of abilities that were introduced in this generation. | [readonly] [default to nothing]
**`main_region`** | [**`*RegionSummary`**](RegionSummary.md) | The main region travelled in this generation. | [default to nothing]
**`moves`** | [**`Vector{MoveSummary}`**](MoveSummary.md) | A list of moves that were introduced in this generation. | [readonly] [default to nothing]
**`names`** | [**`Vector{GenerationName}`**](GenerationName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`pokemon_species`** | [**`Vector{PokemonSpeciesSummary}`**](PokemonSpeciesSummary.md) | A list of Pokémon species that were introduced in this generation. | [readonly] [default to nothing]
**`types`** | [**`Vector{TypeSummary}`**](TypeSummary.md) | A list of types that were introduced in this generation. | [readonly] [default to nothing]
**`version_groups`** | [**`Vector{VersionGroupSummary}`**](VersionGroupSummary.md) | A list of version groups that were introduced in this generation. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


