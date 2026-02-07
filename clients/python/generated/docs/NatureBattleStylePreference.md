# NatureBattleStylePreference


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**low_hp_preference** | **int** |  | 
**high_hp_preference** | **int** |  | 
**move_battle_style** | [**MoveBattleStyleSummary**](MoveBattleStyleSummary.md) |  | 

## Example

```python
from pokeapiclient.models.nature_battle_style_preference import NatureBattleStylePreference

# TODO update the JSON string below
json = "{}"
# create an instance of NatureBattleStylePreference from a JSON string
nature_battle_style_preference_instance = NatureBattleStylePreference.from_json(json)
# print the JSON string representation of the object
print(NatureBattleStylePreference.to_json())

# convert the object into a dict
nature_battle_style_preference_dict = nature_battle_style_preference_instance.to_dict()
# create an instance of NatureBattleStylePreference from a dict
nature_battle_style_preference_from_dict = NatureBattleStylePreference.from_dict(nature_battle_style_preference_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


