# PokeapiClient.LocationAreaEncounterDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minLevel** | **Number** | The lowest level the Pokémon could be encountered at. | 
**maxLevel** | **Number** | The highest level the Pokémon could be encountered at. | 
**chance** | **Number** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] 
**conditionValues** | [**[EncounterConditionValueSummary]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] 
**pokemonDetails** | [**EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] 


