# GrowthRateDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`formula`** | **`String`** | The formula used to calculate the rate at which the Pokémon species gains level. | [default to nothing]
**`descriptions`** | [**`Vector{GrowthRateDescription}`**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to nothing]
**`levels`** | [**`Vector{Experience}`**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] [default to nothing]
**`pokemon_species`** | [**`Vector{PokemonSpeciesSummary}`**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


