# ItemFlingEffectSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.item_fling_effect_summary import ItemFlingEffectSummary

# TODO update the JSON string below
json = "{}"
# create an instance of ItemFlingEffectSummary from a JSON string
item_fling_effect_summary_instance = ItemFlingEffectSummary.from_json(json)
# print the JSON string representation of the object
print(ItemFlingEffectSummary.to_json())

# convert the object into a dict
item_fling_effect_summary_dict = item_fling_effect_summary_instance.to_dict()
# create an instance of ItemFlingEffectSummary from a dict
item_fling_effect_summary_from_dict = ItemFlingEffectSummary.from_dict(item_fling_effect_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


