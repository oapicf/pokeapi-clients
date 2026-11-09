# CharacteristicDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**gene_modulo** | **int** | The remainder of the highest stat/IV divided by 5. |
**possible_values** | **int[]** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly]
**highest_stat** | [**\OpenAPI\Client\Model\StatSummary**](StatSummary.md) | The stat which results in this characteristic. |
**descriptions** | [**\OpenAPI\Client\Model\CharacteristicDescription[]**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
