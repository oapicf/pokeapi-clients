# openapi::PokemonEncounterDetailResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chance** | **integer** | Percent chance that this encounter will occur. | 
**condition_values** | [**array[EncounterConditionValueSummary]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | 
**max_level** | **integer** | The highest level the Pokémon could be encountered at. | 
**method** | [**EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | 
**min_level** | **integer** | The lowest level the Pokémon could be encountered at. | 


