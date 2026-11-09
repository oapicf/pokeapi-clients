# RegionDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`locations`** | [**`Vector{LocationSummary}`**](LocationSummary.md) | A list of locations that can be found in this region. | [readonly] [default to nothing]
**`main_generation`** | [**`*GenerationSummary`**](GenerationSummary.md) | The generation this region was introduced in. | [readonly] [default to nothing]
**`names`** | [**`Vector{RegionName}`**](RegionName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`pokedexes`** | [**`Vector{PokedexSummary}`**](PokedexSummary.md) | A list of pokédexes that catalogue Pokémon in this region. | [readonly] [default to nothing]
**`version_groups`** | [**`Vector{VersionGroupSummary}`**](VersionGroupSummary.md) | A list of version groups where this region can be visited. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


