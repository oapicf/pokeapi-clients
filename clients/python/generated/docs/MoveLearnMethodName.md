# MoveLearnMethodName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from pokeapiclient.models.move_learn_method_name import MoveLearnMethodName

# TODO update the JSON string below
json = "{}"
# create an instance of MoveLearnMethodName from a JSON string
move_learn_method_name_instance = MoveLearnMethodName.from_json(json)
# print the JSON string representation of the object
print(MoveLearnMethodName.to_json())

# convert the object into a dict
move_learn_method_name_dict = move_learn_method_name_instance.to_dict()
# create an instance of MoveLearnMethodName from a dict
move_learn_method_name_from_dict = MoveLearnMethodName.from_dict(move_learn_method_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


