# EvolutionChainLink


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_baby** | **bool** | Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. | 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species at this point in the evolution chain. | 
**evolution_details** | [**List[PokemonEvolution]**](PokemonEvolution.md) | All details regarding the specific details of the referenced Pokémon species evolution. | 
**evolves_to** | [**List[EvolutionChainLink]**](EvolutionChainLink.md) | A List of chain objects. | [readonly] 

## Example

```python
from openapi_client.models.evolution_chain_link import EvolutionChainLink

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionChainLink from a JSON string
evolution_chain_link_instance = EvolutionChainLink.from_json(json)
# print the JSON string representation of the object
print EvolutionChainLink.to_json()

# convert the object into a dict
evolution_chain_link_dict = evolution_chain_link_instance.to_dict()
# create an instance of EvolutionChainLink from a dict
evolution_chain_link_from_dict = EvolutionChainLink.from_dict(evolution_chain_link_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


