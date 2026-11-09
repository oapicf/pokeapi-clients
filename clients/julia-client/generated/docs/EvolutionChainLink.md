# EvolutionChainLink


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`is_baby`** | **`Bool`** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | [default to nothing]
**`species`** | [**`*PokemonSpeciesSummary`**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | [default to nothing]
**`evolution_details`** | [**`Vector{PokemonEvolution}`**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | [default to nothing]
**`evolves_to`** | [**`Vector{EvolutionChainLink}`**](EvolutionChainLink.md) | A List of chain objects. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


