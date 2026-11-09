# OAILocationAreaEncounterDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minLevel** | **NSNumber*** | The lowest level the Pokémon could be encountered at. | 
**maxLevel** | **NSNumber*** | The highest level the Pokémon could be encountered at. | 
**chance** | **NSNumber*** | Percent chance that this encounter will occur. | [optional] [default to @0]
**method** | [**OAIEncounterMethodSummary***](OAIEncounterMethodSummary.md) | The method by which this encounter happens. | [optional] 
**conditionValues** | [**NSArray&lt;OAIEncounterConditionValueSummary&gt;***](OAIEncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] 
**pokemonDetails** | [**OAIEncounterPokemonDetail***](OAIEncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


