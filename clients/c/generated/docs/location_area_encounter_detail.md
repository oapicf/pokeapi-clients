# location_area_encounter_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **int** | The lowest level the Pokémon could be encountered at. | 
**max_level** | **int** | The highest level the Pokémon could be encountered at. | 
**chance** | **int** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [**encounter_method_summary_t**](encounter_method_summary.md) \* | The method by which this encounter happens. | [optional] 
**condition_values** | [**list_t**](encounter_condition_value_summary.md) \* | A list of condition values that must be in effect for this encounter to occur. | [readonly] 
**pokemon_details** | [**encounter_pokemon_detail_t**](encounter_pokemon_detail.md) \* | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


