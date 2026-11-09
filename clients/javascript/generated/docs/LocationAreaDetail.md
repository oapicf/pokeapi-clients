# PokeapiClient.LocationAreaDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**gameIndex** | **Number** | The internal id of an API resource within game data. | 
**encounterMethodRates** | [**[LocationAreaEncounterRate]**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**names** | [**[LocationAreaName]**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemonEncounters** | [**[LocationAreaPokemonEncounter]**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 


