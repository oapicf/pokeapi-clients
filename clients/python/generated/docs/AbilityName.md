# AbilityName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.ability_name import AbilityName

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityName from a JSON string
ability_name_instance = AbilityName.from_json(json)
# print the JSON string representation of the object
print(AbilityName.to_json())

# convert the object into a dict
ability_name_dict = ability_name_instance.to_dict()
# create an instance of AbilityName from a dict
ability_name_from_dict = AbilityName.from_dict(ability_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


