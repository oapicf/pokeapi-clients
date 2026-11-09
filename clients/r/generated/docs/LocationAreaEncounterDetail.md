# openapi::LocationAreaEncounterDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **integer** | The lowest level the Pokémon could be encountered at. | 
**max_level** | **integer** | The highest level the Pokémon could be encountered at. | 
**chance** | **integer** | Percent chance that this encounter will occur. | [optional] [default to 0] 
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] 
**condition_values** | [**array[EncounterConditionValueSummary]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] 
**pokemon_details** | [**EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] 


