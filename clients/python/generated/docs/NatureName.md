# NatureName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.nature_name import NatureName

# TODO update the JSON string below
json = "{}"
# create an instance of NatureName from a JSON string
nature_name_instance = NatureName.from_json(json)
# print the JSON string representation of the object
print(NatureName.to_json())

# convert the object into a dict
nature_name_dict = nature_name_instance.to_dict()
# create an instance of NatureName from a dict
nature_name_from_dict = NatureName.from_dict(nature_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


