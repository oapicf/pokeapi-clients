# LocationAreaDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`game_index`** | **`Int64`** | The internal id of an API resource within game data. | [default to nothing]
**`encounter_method_rates`** | [**`Vector{LocationAreaEncounterRate}`**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] [default to nothing]
**`location`** | [**`*LocationSummary`**](LocationSummary.md) | The region this location area can be found in. | [default to nothing]
**`names`** | [**`Vector{LocationAreaName}`**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`pokemon_encounters`** | [**`Vector{LocationAreaPokemonEncounter}`**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


