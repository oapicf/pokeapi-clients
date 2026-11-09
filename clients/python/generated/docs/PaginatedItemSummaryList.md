# PaginatedItemSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | The total number of resources available from this API. | 
**next** | **str** | The URL for the next page in the list, or null if there is no next page. | [optional] 
**previous** | **str** | The URL for the previous page in the list, or null if there is no previous page. | [optional] 
**results** | [**List[ItemSummary]**](ItemSummary.md) | A list of API resources on this page. | 

## Example

```python
from pokeapiclient.models.paginated_item_summary_list import PaginatedItemSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedItemSummaryList from a JSON string
paginated_item_summary_list_instance = PaginatedItemSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedItemSummaryList.to_json())

# convert the object into a dict
paginated_item_summary_list_dict = paginated_item_summary_list_instance.to_dict()
# create an instance of PaginatedItemSummaryList from a dict
paginated_item_summary_list_from_dict = PaginatedItemSummaryList.from_dict(paginated_item_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


