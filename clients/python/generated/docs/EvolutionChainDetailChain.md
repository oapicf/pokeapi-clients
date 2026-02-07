# EvolutionChainDetailChain


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**evolution_details** | **List[object]** |  | 
**evolves_to** | [**List[EvolutionChainDetailChainEvolvesToInner]**](EvolutionChainDetailChainEvolvesToInner.md) |  | 
**is_baby** | **bool** |  | 
**species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.evolution_chain_detail_chain import EvolutionChainDetailChain

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionChainDetailChain from a JSON string
evolution_chain_detail_chain_instance = EvolutionChainDetailChain.from_json(json)
# print the JSON string representation of the object
print(EvolutionChainDetailChain.to_json())

# convert the object into a dict
evolution_chain_detail_chain_dict = evolution_chain_detail_chain_instance.to_dict()
# create an instance of EvolutionChainDetailChain from a dict
evolution_chain_detail_chain_from_dict = EvolutionChainDetailChain.from_dict(evolution_chain_detail_chain_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


