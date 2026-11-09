# LocationAreaEncounterDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_level** | **int** | The lowest level the Pokémon could be encountered at. |
**max_level** | **int** | The highest level the Pokémon could be encountered at. |
**chance** | **int** | Percent chance that this encounter will occur. | [optional] [default to 0]
**method** | [**\OpenAPI\Client\Model\EncounterMethodSummary**](EncounterMethodSummary.md) | The method by which this encounter happens. | [optional]
**condition_values** | [**\OpenAPI\Client\Model\EncounterConditionValueSummary[]**](EncounterConditionValueSummary.md) | A list of condition values that must be in effect for this encounter to occur. | [readonly]
**pokemon_details** | [**\OpenAPI\Client\Model\EncounterPokemonDetail**](EncounterPokemonDetail.md) | Additional properties of the encountered Pokémon, or null if unspecified. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
