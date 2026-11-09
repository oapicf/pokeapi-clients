# LocationAreaDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**gameIndex** | **Int!** | The internal id of an API resource within game data. | [default to null]
**encounterMethodRates** | [**LocationAreaEncounterRate**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] [default to null]
**location** | [***LocationSummary**](LocationSummary.md) | The region this location area can be found in. | [default to null]
**names** | [**LocationAreaName**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pokemonEncounters** | [**LocationAreaPokemonEncounter**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


