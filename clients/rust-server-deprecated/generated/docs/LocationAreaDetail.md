# LocationAreaDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**game_index** | **i32** | The internal id of an API resource within game data. | 
**encounter_method_rates** | [**Vec<models::LocationAreaEncounterRate>**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**location** | [***models::LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**names** | [**Vec<models::LocationAreaName>**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_encounters** | [**Vec<models::LocationAreaPokemonEncounter>**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


