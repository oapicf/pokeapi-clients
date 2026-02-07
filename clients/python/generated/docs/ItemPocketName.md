# ItemPocketName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.item_pocket_name import ItemPocketName

# TODO update the JSON string below
json = "{}"
# create an instance of ItemPocketName from a JSON string
item_pocket_name_instance = ItemPocketName.from_json(json)
# print the JSON string representation of the object
print(ItemPocketName.to_json())

# convert the object into a dict
item_pocket_name_dict = item_pocket_name_instance.to_dict()
# create an instance of ItemPocketName from a dict
item_pocket_name_from_dict = ItemPocketName.from_dict(item_pocket_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


