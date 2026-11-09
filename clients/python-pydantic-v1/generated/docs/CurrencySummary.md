# CurrencySummary


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the referenced resource. | 
**url** | **str** | The URL of the referenced resource. | [readonly] 

## Example

```python
from openapi_client.models.currency_summary import CurrencySummary

# TODO update the JSON string below
json = "{}"
# create an instance of CurrencySummary from a JSON string
currency_summary_instance = CurrencySummary.from_json(json)
# print the JSON string representation of the object
print CurrencySummary.to_json()

# convert the object into a dict
currency_summary_dict = currency_summary_instance.to_dict()
# create an instance of CurrencySummary from a dict
currency_summary_from_dict = CurrencySummary.from_dict(currency_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


