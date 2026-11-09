# GrowthRateDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The identifier for this resource. | [readonly] [default to null]
**name** | **String!** | The name for this resource. | [default to null]
**formula** | **String!** | The formula used to calculate the rate at which the Pokémon species gains level. | [default to null]
**descriptions** | [**GrowthRateDescription**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to null]
**levels** | [**Experience**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] [default to null]
**pokemonSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


