# ContestTypeName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**color** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.contest_type_name import ContestTypeName

# TODO update the JSON string below
json = "{}"
# create an instance of ContestTypeName from a JSON string
contest_type_name_instance = ContestTypeName.from_json(json)
# print the JSON string representation of the object
print(ContestTypeName.to_json())

# convert the object into a dict
contest_type_name_dict = contest_type_name_instance.to_dict()
# create an instance of ContestTypeName from a dict
contest_type_name_from_dict = ContestTypeName.from_dict(contest_type_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


