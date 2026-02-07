# MoveLearnMethodDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_learn_method_description import MoveLearnMethodDescription

# TODO update the JSON string below
json = "{}"
# create an instance of MoveLearnMethodDescription from a JSON string
move_learn_method_description_instance = MoveLearnMethodDescription.from_json(json)
# print the JSON string representation of the object
print(MoveLearnMethodDescription.to_json())

# convert the object into a dict
move_learn_method_description_dict = move_learn_method_description_instance.to_dict()
# create an instance of MoveLearnMethodDescription from a dict
move_learn_method_description_from_dict = MoveLearnMethodDescription.from_dict(move_learn_method_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


