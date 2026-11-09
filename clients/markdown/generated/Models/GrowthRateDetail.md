# GrowthRateDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **formula** | **String** | The formula used to calculate the rate at which the Pokémon species gains level. | [default to null] |
| **descriptions** | [**List**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [default to null] |
| **levels** | [**List**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [default to null] |
| **pokemon\_species** | [**List**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

