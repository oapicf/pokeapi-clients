# ItemAttributeDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**descriptions** | [**List[ItemAttributeDescription]**](ItemAttributeDescription.md) | The description of this item attribute listed in different languages. | [readonly] 
**items** | [**List[ItemSummary]**](ItemSummary.md) | A list of items that have this attribute. | [readonly] 
**names** | [**List[ItemAttributeName]**](ItemAttributeName.md) | The name of this item attribute listed in different languages. | [readonly] 

## Example

```python
from pokeapiclient.models.item_attribute_detail import ItemAttributeDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ItemAttributeDetail from a JSON string
item_attribute_detail_instance = ItemAttributeDetail.from_json(json)
# print the JSON string representation of the object
print(ItemAttributeDetail.to_json())

# convert the object into a dict
item_attribute_detail_dict = item_attribute_detail_instance.to_dict()
# create an instance of ItemAttributeDetail from a dict
item_attribute_detail_from_dict = ItemAttributeDetail.from_dict(item_attribute_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


