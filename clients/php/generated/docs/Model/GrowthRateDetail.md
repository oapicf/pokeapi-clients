# GrowthRateDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**formula** | **string** | The formula used to calculate the rate at which the Pokémon species gains level. |
**descriptions** | [**\OpenAPI\Client\Model\GrowthRateDescription[]**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly]
**levels** | [**\OpenAPI\Client\Model\Experience[]**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly]
**pokemon_species** | [**\OpenAPI\Client\Model\PokemonSpeciesSummary[]**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
