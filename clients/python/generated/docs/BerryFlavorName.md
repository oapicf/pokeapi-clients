# BerryFlavorName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.berry_flavor_name import BerryFlavorName

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFlavorName from a JSON string
berry_flavor_name_instance = BerryFlavorName.from_json(json)
# print the JSON string representation of the object
print(BerryFlavorName.to_json())

# convert the object into a dict
berry_flavor_name_dict = berry_flavor_name_instance.to_dict()
# create an instance of BerryFlavorName from a dict
berry_flavor_name_from_dict = BerryFlavorName.from_dict(berry_flavor_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


