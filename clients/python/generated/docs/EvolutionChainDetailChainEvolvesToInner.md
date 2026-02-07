# EvolutionChainDetailChainEvolvesToInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**evolution_details** | [**List[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner]**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.md) |  | 
**is_baby** | **bool** |  | 
**species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.evolution_chain_detail_chain_evolves_to_inner import EvolutionChainDetailChainEvolvesToInner

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionChainDetailChainEvolvesToInner from a JSON string
evolution_chain_detail_chain_evolves_to_inner_instance = EvolutionChainDetailChainEvolvesToInner.from_json(json)
# print the JSON string representation of the object
print(EvolutionChainDetailChainEvolvesToInner.to_json())

# convert the object into a dict
evolution_chain_detail_chain_evolves_to_inner_dict = evolution_chain_detail_chain_evolves_to_inner_instance.to_dict()
# create an instance of EvolutionChainDetailChainEvolvesToInner from a dict
evolution_chain_detail_chain_evolves_to_inner_from_dict = EvolutionChainDetailChainEvolvesToInner.from_dict(evolution_chain_detail_chain_evolves_to_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


