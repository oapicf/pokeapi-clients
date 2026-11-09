# evolution_chain_link_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_baby** | **int** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**species** | [**pokemon_species_summary_t**](pokemon_species_summary.md) \* | The Pokémon species at this point in the evolution chain. | 
**evolution_details** | [**list_t**](pokemon_evolution.md) \* | All details regarding the specific details of the referenced Pokémon species evolution. | 
**evolves_to** | [**list_t**](evolution_chain_link.md) \* | A List of chain objects. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


