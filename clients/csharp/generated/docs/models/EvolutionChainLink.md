# Org.OpenAPITools.Model.EvolutionChainLink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsBaby** | **bool** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**Species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | 
**EvolutionDetails** | [**List&lt;PokemonEvolution&gt;**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**EvolvesTo** | [**List&lt;EvolutionChainLink&gt;**](EvolutionChainLink.md) | A List of chain objects. | [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

