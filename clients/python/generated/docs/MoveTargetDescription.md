# MoveTargetDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_target_description import MoveTargetDescription

# TODO update the JSON string below
json = "{}"
# create an instance of MoveTargetDescription from a JSON string
move_target_description_instance = MoveTargetDescription.from_json(json)
# print the JSON string representation of the object
print(MoveTargetDescription.to_json())

# convert the object into a dict
move_target_description_dict = move_target_description_instance.to_dict()
# create an instance of MoveTargetDescription from a dict
move_target_description_from_dict = MoveTargetDescription.from_dict(move_target_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


