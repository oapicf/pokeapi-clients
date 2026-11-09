# LocationAreaDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**gameIndex** | **Int** | The internal id of an API resource within game data. | 
**encounterMethodRates** | [LocationAreaEncounterRate] | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**names** | [LocationAreaName] | The name of this resource listed in different languages. | [readonly] 
**pokemonEncounters** | [LocationAreaPokemonEncounter] | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


