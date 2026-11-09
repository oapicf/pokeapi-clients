# ItemPrice


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchase_price** | **int** | The purchase price in this currency and version group, or null if unavailable. | [optional] 
**sell_price** | **int** | The sell price in this currency and version group, or null if unavailable. | [optional] 
**currency** | [**CurrencySummary**](CurrencySummary.md) | The currency used for this price. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group to which this price applies. | 

## Example

```python
from openapi_client.models.item_price import ItemPrice

# TODO update the JSON string below
json = "{}"
# create an instance of ItemPrice from a JSON string
item_price_instance = ItemPrice.from_json(json)
# print the JSON string representation of the object
print ItemPrice.to_json()

# convert the object into a dict
item_price_dict = item_price_instance.to_dict()
# create an instance of ItemPrice from a dict
item_price_from_dict = ItemPrice.from_dict(item_price_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


