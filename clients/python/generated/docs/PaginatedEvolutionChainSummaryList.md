# PaginatedEvolutionChainSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[EvolutionChainSummary]**](EvolutionChainSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_evolution_chain_summary_list import PaginatedEvolutionChainSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedEvolutionChainSummaryList from a JSON string
paginated_evolution_chain_summary_list_instance = PaginatedEvolutionChainSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedEvolutionChainSummaryList.to_json())

# convert the object into a dict
paginated_evolution_chain_summary_list_dict = paginated_evolution_chain_summary_list_instance.to_dict()
# create an instance of PaginatedEvolutionChainSummaryList from a dict
paginated_evolution_chain_summary_list_from_dict = PaginatedEvolutionChainSummaryList.from_dict(paginated_evolution_chain_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


