# GROWTH_RATE_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**formula** | [**STRING_32**](STRING_32.md) | The formula used to calculate the rate at which the Pokémon species gains level. | [default to null]
**descriptions** | [**LIST [GROWTH_RATE_DESCRIPTION]**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to null]
**levels** | [**LIST [EXPERIENCE]**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] [default to null]
**pokemon_species** | [**LIST [POKEMON_SPECIES_SUMMARY]**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


