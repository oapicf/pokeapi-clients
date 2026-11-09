# LOCATION_AREA_ENCOUNTER_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **INTEGER_32** | The lowest level the Pokémon could be encountered at. | [default to null]
**max_level** | **INTEGER_32** | The highest level the Pokémon could be encountered at. | [default to null]
**chance** | **INTEGER_32** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [**ENCOUNTER_METHOD_SUMMARY**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] [default to null]
**condition_values** | [**LIST [ENCOUNTER_CONDITION_VALUE_SUMMARY]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] [default to null]
**pokemon_details** | [**ENCOUNTER_POKEMON_DETAIL**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


