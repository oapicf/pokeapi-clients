# EggGroupName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.egg_group_name import EggGroupName

# TODO update the JSON string below
json = "{}"
# create an instance of EggGroupName from a JSON string
egg_group_name_instance = EggGroupName.from_json(json)
# print the JSON string representation of the object
print(EggGroupName.to_json())

# convert the object into a dict
egg_group_name_dict = egg_group_name_instance.to_dict()
# create an instance of EggGroupName from a dict
egg_group_name_from_dict = EggGroupName.from_dict(egg_group_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


