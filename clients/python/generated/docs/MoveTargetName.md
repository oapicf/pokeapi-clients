# MoveTargetName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_target_name import MoveTargetName

# TODO update the JSON string below
json = "{}"
# create an instance of MoveTargetName from a JSON string
move_target_name_instance = MoveTargetName.from_json(json)
# print the JSON string representation of the object
print(MoveTargetName.to_json())

# convert the object into a dict
move_target_name_dict = move_target_name_instance.to_dict()
# create an instance of MoveTargetName from a dict
move_target_name_from_dict = MoveTargetName.from_dict(move_target_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


