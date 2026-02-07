# MoveBattleStyleName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_battle_style_name import MoveBattleStyleName

# TODO update the JSON string below
json = "{}"
# create an instance of MoveBattleStyleName from a JSON string
move_battle_style_name_instance = MoveBattleStyleName.from_json(json)
# print the JSON string representation of the object
print(MoveBattleStyleName.to_json())

# convert the object into a dict
move_battle_style_name_dict = move_battle_style_name_instance.to_dict()
# create an instance of MoveBattleStyleName from a dict
move_battle_style_name_from_dict = MoveBattleStyleName.from_dict(move_battle_style_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


