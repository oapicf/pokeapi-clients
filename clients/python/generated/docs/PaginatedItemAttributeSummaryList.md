# PaginatedItemAttributeSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[ItemAttributeSummary]**](ItemAttributeSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_item_attribute_summary_list import PaginatedItemAttributeSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedItemAttributeSummaryList from a JSON string
paginated_item_attribute_summary_list_instance = PaginatedItemAttributeSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedItemAttributeSummaryList.to_json())

# convert the object into a dict
paginated_item_attribute_summary_list_dict = paginated_item_attribute_summary_list_instance.to_dict()
# create an instance of PaginatedItemAttributeSummaryList from a dict
paginated_item_attribute_summary_list_from_dict = PaginatedItemAttributeSummaryList.from_dict(paginated_item_attribute_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


