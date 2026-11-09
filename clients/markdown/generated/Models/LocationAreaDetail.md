# LocationAreaDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **game\_index** | **Integer** | The internal id of an API resource within game data. | [default to null] |
| **encounter\_method\_rates** | [**List**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [default to null] |
| **location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | [default to null] |
| **names** | [**List**](LocationAreaName.md) | The name of this resource listed in different languages. | [default to null] |
| **pokemon\_encounters** | [**List**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

