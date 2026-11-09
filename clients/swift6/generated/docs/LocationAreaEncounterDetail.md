# LocationAreaEncounterDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minLevel** | **Int** | The lowest level the Pokémon could be encountered at. | 
**maxLevel** | **Int** | The highest level the Pokémon could be encountered at. | 
**chance** | **Int** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] 
**conditionValues** | [EncounterConditionValueSummary] | A list of condition values that must be in effect for this encounter to occur. | [readonly] 
**pokemonDetails** | [**EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


