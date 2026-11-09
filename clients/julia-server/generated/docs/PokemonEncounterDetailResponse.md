# PokemonEncounterDetailResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`chance`** | **`Int64`** | Percent chance that this encounter will occur. | [default to nothing]
**`condition_values`** | [**`Vector{EncounterConditionValueSummary}`**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [default to nothing]
**`max_level`** | **`Int64`** | The highest level the Pokémon could be encountered at. | [default to nothing]
**`method`** | [**`*EncounterMethodSummary`**](EncounterMethodSummary.md) | The method by which this encounter happens. | [default to nothing]
**`min_level`** | **`Int64`** | The lowest level the Pokémon could be encountered at. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


