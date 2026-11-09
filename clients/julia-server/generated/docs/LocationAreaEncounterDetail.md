# LocationAreaEncounterDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`min_level`** | **`Int64`** | The lowest level the Pokémon could be encountered at. | [default to nothing]
**`max_level`** | **`Int64`** | The highest level the Pokémon could be encountered at. | [default to nothing]
**`chance`** | **`Int64`** | Percent chance that this encounter will occur. | [optional] [default to 0]
**`method`** | [**`*EncounterMethodSummary`**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional] [default to nothing]
**`condition_values`** | [**`Vector{EncounterConditionValueSummary}`**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly] [default to nothing]
**`pokemon_details`** | [**`*EncounterPokemonDetail`**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


