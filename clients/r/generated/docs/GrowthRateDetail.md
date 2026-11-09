# openapi::GrowthRateDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**formula** | **character** | The formula used to calculate the rate at which the Pokémon species gains level. | [Max. length: 500] 
**descriptions** | [**array[GrowthRateDescription]**](GrowthRateDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 
**levels** | [**array[Experience]**](Experience.md) | A list of levels and the amount of experienced needed to atain them based on this growth rate. | [readonly] 
**pokemon_species** | [**array[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that gain levels at this growth rate. | [readonly] 


