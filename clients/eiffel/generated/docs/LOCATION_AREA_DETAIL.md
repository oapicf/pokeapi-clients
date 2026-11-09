# LOCATION_AREA_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**game_index** | **INTEGER_32** | The internal id of an API resource within game data. | [default to null]
**encounter_method_rates** | [**LIST [LOCATION_AREA_ENCOUNTER_RATE]**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] [default to null]
**location** | [**LOCATION_SUMMARY**](LocationSummary.md) | The region this location area can be found in. | [default to null]
**names** | [**LIST [LOCATION_AREA_NAME]**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pokemon_encounters** | [**LIST [LOCATION_AREA_POKEMON_ENCOUNTER]**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


