# ItemFlingEffectDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**effect_entries** | [**List[ItemFlingEffectEffectText]**](ItemFlingEffectEffectText.md) |  | [readonly] 
**items** | [**List[ItemSummary]**](ItemSummary.md) |  | [readonly] 

## Example

```python
from openapi_client.models.item_fling_effect_detail import ItemFlingEffectDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ItemFlingEffectDetail from a JSON string
item_fling_effect_detail_instance = ItemFlingEffectDetail.from_json(json)
# print the JSON string representation of the object
print ItemFlingEffectDetail.to_json()

# convert the object into a dict
item_fling_effect_detail_dict = item_fling_effect_detail_instance.to_dict()
# create an instance of ItemFlingEffectDetail from a dict
item_fling_effect_detail_from_dict = ItemFlingEffectDetail.from_dict(item_fling_effect_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


