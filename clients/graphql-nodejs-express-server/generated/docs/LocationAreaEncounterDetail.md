# LocationAreaEncounterDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minLevel** | **Int!** | The lowest level the Pokémon could be encountered at. | [default to null]
**maxLevel** | **Int!** | The highest level the Pokémon could be encountered at. | [default to null]
**chance** | **Int!** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [***EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] [default to null]
**conditionValues** | [**EncounterConditionValueSummary**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] [default to null]
**pokemonDetails** | [***EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


