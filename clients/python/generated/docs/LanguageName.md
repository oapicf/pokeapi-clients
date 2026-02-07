# LanguageName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.language_name import LanguageName

# TODO update the JSON string below
json = "{}"
# create an instance of LanguageName from a JSON string
language_name_instance = LanguageName.from_json(json)
# print the JSON string representation of the object
print(LanguageName.to_json())

# convert the object into a dict
language_name_dict = language_name_instance.to_dict()
# create an instance of LanguageName from a dict
language_name_from_dict = LanguageName.from_dict(language_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


