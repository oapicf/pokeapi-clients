# openapi::LocationAreaDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**game_index** | **integer** | The internal id of an API resource within game data. | [Max: 2147483647] [Min: -2147483648] 
**encounter_method_rates** | [**array[LocationAreaEncounterRate]**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**names** | [**array[LocationAreaName]**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_encounters** | [**array[LocationAreaPokemonEncounter]**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 


