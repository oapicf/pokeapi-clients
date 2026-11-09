# EVOLUTION_CHAIN_LINK

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_baby** | **BOOLEAN** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | [default to null]
**species** | [**POKEMON_SPECIES_SUMMARY**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | [default to null]
**evolution_details** | [**LIST [POKEMON_EVOLUTION]**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | [default to null]
**evolves_to** | [**LIST [EVOLUTION_CHAIN_LINK]**](EvolutionChainLink.md) | A List of chain objects. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


