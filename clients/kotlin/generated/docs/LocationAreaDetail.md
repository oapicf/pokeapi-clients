
# LocationAreaDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int** | The identifier for this resource. |  [readonly] |
| **name** | **kotlin.String** | The name for this resource. |  |
| **gameIndex** | **kotlin.Int** | The internal id of an API resource within game data. |  |
| **encounterMethodRates** | [**kotlin.collections.List&lt;LocationAreaEncounterRate&gt;**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. |  [readonly] |
| **location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. |  |
| **names** | [**kotlin.collections.List&lt;LocationAreaName&gt;**](LocationAreaName.md) | The name of this resource listed in different languages. |  [readonly] |
| **pokemonEncounters** | [**kotlin.collections.List&lt;LocationAreaPokemonEncounter&gt;**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. |  [readonly] |



