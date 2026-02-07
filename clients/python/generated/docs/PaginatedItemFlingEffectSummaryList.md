# PaginatedItemFlingEffectSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[ItemFlingEffectSummary]**](ItemFlingEffectSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_item_fling_effect_summary_list import PaginatedItemFlingEffectSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedItemFlingEffectSummaryList from a JSON string
paginated_item_fling_effect_summary_list_instance = PaginatedItemFlingEffectSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedItemFlingEffectSummaryList.to_json())

# convert the object into a dict
paginated_item_fling_effect_summary_list_dict = paginated_item_fling_effect_summary_list_instance.to_dict()
# create an instance of PaginatedItemFlingEffectSummaryList from a dict
paginated_item_fling_effect_summary_list_from_dict = PaginatedItemFlingEffectSummaryList.from_dict(paginated_item_fling_effect_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


