# LocationAreaDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**game_index** | **int** | The internal id of an API resource within game data. |
**encounter_method_rates** | [**\OpenAPI\Client\Model\LocationAreaEncounterRate[]**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly]
**location** | [**\OpenAPI\Client\Model\LocationSummary**](LocationSummary.md) | The region this location area can be found in. |
**names** | [**\OpenAPI\Client\Model\LocationAreaName[]**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly]
**pokemon_encounters** | [**\OpenAPI\Client\Model\LocationAreaPokemonEncounter[]**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
