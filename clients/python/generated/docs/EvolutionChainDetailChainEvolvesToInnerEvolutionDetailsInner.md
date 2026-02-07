# EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gender** | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  | 
**held_item** | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  | 
**item** | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  | 
**known_move** | **object** |  | 
**known_move_type** | **object** |  | 
**location** | [**EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender**](EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.md) |  | 
**min_affection** | **int** |  | 
**min_beauty** | **int** |  | 
**min_happiness** | **int** |  | 
**min_level** | **int** |  | 
**needs_overworld_rain** | **bool** |  | 
**party_species** | **str** |  | 
**party_type** | **str** |  | 
**relative_physical_stats** | **str** |  | 
**time_of_day** | **str** |  | 
**trade_species** | **str** |  | 
**trigger** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**turn_upside_down** | **bool** |  | 

## Example

```python
from pokeapiclient.models.evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner import EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner from a JSON string
evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_instance = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.from_json(json)
# print the JSON string representation of the object
print(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.to_json())

# convert the object into a dict
evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_dict = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_instance.to_dict()
# create an instance of EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner from a dict
evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_from_dict = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.from_dict(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


