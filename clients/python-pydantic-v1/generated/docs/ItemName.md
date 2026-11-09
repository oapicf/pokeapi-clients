# ItemName


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from openapi_client.models.item_name import ItemName

# TODO update the JSON string below
json = "{}"
# create an instance of ItemName from a JSON string
item_name_instance = ItemName.from_json(json)
# print the JSON string representation of the object
print ItemName.to_json()

# convert the object into a dict
item_name_dict = item_name_instance.to_dict()
# create an instance of ItemName from a dict
item_name_from_dict = ItemName.from_dict(item_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


