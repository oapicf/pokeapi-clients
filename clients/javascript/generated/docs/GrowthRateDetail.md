# PokeapiClient.GrowthRateDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | The identifier for this resource. | [readonly] 
**name** | **String** | The name for this resource. | 
**formula** | **String** | The formula used to calculate the rate at which the Pokémon species gains level. | 
**descriptions** | [**[GrowthRateDescription]**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 
**levels** | [**[Experience]**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**pokemonSpecies** | [**[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] 


