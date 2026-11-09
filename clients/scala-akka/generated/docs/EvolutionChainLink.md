

# EvolutionChainLink


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isBaby** | **Boolean** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | 
**evolutionDetails** | [**Seq&lt;PokemonEvolution&gt;**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**evolvesTo** | [**Seq&lt;EvolutionChainLink&gt;**](EvolutionChainLink.md) | A List of chain objects. |  [readonly]



