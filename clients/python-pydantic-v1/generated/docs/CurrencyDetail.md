# CurrencyDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**names** | [**List[CurrencyName]**](CurrencyName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from openapi_client.models.currency_detail import CurrencyDetail

# TODO update the JSON string below
json = "{}"
# create an instance of CurrencyDetail from a JSON string
currency_detail_instance = CurrencyDetail.from_json(json)
# print the JSON string representation of the object
print CurrencyDetail.to_json()

# convert the object into a dict
currency_detail_dict = currency_detail_instance.to_dict()
# create an instance of CurrencyDetail from a dict
currency_detail_from_dict = CurrencyDetail.from_dict(currency_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


