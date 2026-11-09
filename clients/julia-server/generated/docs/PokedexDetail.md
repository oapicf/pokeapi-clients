# PokedexDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`is_main_series`** | **`Bool`** | Whether or not this Pokédex originated in the main series of the video games. | [optional] [default to nothing]
**`descriptions`** | [**`Vector{PokedexDescription}`**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] [default to nothing]
**`names`** | [**`Vector{PokedexName}`**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`pokemon_entries`** | [**`Vector{PokemonDexNumber}`**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] [default to nothing]
**`region`** | [**`*RegionSummary`**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | [default to nothing]
**`version_groups`** | [**`Vector{VersionGroupSummary}`**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


