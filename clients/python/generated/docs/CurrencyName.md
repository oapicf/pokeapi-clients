# CurrencyName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from pokeapiclient.models.currency_name import CurrencyName

# TODO update the JSON string below
json = "{}"
# create an instance of CurrencyName from a JSON string
currency_name_instance = CurrencyName.from_json(json)
# print the JSON string representation of the object
print(CurrencyName.to_json())

# convert the object into a dict
currency_name_dict = currency_name_instance.to_dict()
# create an instance of CurrencyName from a dict
currency_name_from_dict = CurrencyName.from_dict(currency_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


