# LocationAreaEncounterDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **i32** | The lowest level the Pokémon could be encountered at. | 
**max_level** | **i32** | The highest level the Pokémon could be encountered at. | 
**chance** | Option<**i32**> | Percent chance that this encounter will occur. | [optional][default to 0]
**method** | Option<[**models::EncounterMethodSummary**](EncounterMethodSummary.md)> | The method by which this encounter happens. | [optional]
**condition_values** | [**Vec<models::EncounterConditionValueSummary>**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly]
**pokemon_details** | Option<[**models::EncounterPokemonDetail**](EncounterPokemonDetail.md)> | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


