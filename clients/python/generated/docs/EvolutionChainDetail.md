# EvolutionChainDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**baby_trigger_item** | [**ItemSummary**](ItemSummary.md) |  | 
**chain** | [**EvolutionChainDetailChain**](EvolutionChainDetailChain.md) |  | 

## Example

```python
from pokeapiclient.models.evolution_chain_detail import EvolutionChainDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionChainDetail from a JSON string
evolution_chain_detail_instance = EvolutionChainDetail.from_json(json)
# print the JSON string representation of the object
print(EvolutionChainDetail.to_json())

# convert the object into a dict
evolution_chain_detail_dict = evolution_chain_detail_instance.to_dict()
# create an instance of EvolutionChainDetail from a dict
evolution_chain_detail_from_dict = EvolutionChainDetail.from_dict(evolution_chain_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


