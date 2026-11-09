# OAILocationAreaDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | The identifier for this resource. | [readonly] 
**name** | **NSString*** | The name for this resource. | 
**gameIndex** | **NSNumber*** | The internal id of an API resource within game data. | 
**encounterMethodRates** | [**NSArray&lt;OAILocationAreaEncounterRate&gt;***](OAILocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**location** | [**OAILocationSummary***](OAILocationSummary.md) | The region this location area can be found in. | 
**names** | [**NSArray&lt;OAILocationAreaName&gt;***](OAILocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemonEncounters** | [**NSArray&lt;OAILocationAreaPokemonEncounter&gt;***](OAILocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


