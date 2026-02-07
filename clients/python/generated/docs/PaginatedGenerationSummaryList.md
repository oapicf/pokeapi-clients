# PaginatedGenerationSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[GenerationSummary]**](GenerationSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_generation_summary_list import PaginatedGenerationSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedGenerationSummaryList from a JSON string
paginated_generation_summary_list_instance = PaginatedGenerationSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedGenerationSummaryList.to_json())

# convert the object into a dict
paginated_generation_summary_list_dict = paginated_generation_summary_list_instance.to_dict()
# create an instance of PaginatedGenerationSummaryList from a dict
paginated_generation_summary_list_from_dict = PaginatedGenerationSummaryList.from_dict(paginated_generation_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


