# TypeName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from pokeapiclient.models.type_name import TypeName

# TODO update the JSON string below
json = "{}"
# create an instance of TypeName from a JSON string
type_name_instance = TypeName.from_json(json)
# print the JSON string representation of the object
print(TypeName.to_json())

# convert the object into a dict
type_name_dict = type_name_instance.to_dict()
# create an instance of TypeName from a dict
type_name_from_dict = TypeName.from_dict(type_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


