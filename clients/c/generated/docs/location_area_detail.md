# location_area_detail_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **char \*** | The name for this resource. | 
**game_index** | **int** | The internal id of an API resource within game data. | 
**encounter_method_rates** | [**list_t**](location_area_encounter_rate.md) \* | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**location** | [**location_summary_t**](location_summary.md) \* | The region this location area can be found in. | 
**names** | [**list_t**](location_area_name.md) \* | The name of this resource listed in different languages. | [readonly] 
**pokemon_encounters** | [**list_t**](location_area_pokemon_encounter.md) \* | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


