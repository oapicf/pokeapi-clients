# MoveBattleStyleDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**names** | [**List[MoveBattleStyleName]**](MoveBattleStyleName.md) |  | 

## Example

```python
from pokeapiclient.models.move_battle_style_detail import MoveBattleStyleDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveBattleStyleDetail from a JSON string
move_battle_style_detail_instance = MoveBattleStyleDetail.from_json(json)
# print the JSON string representation of the object
print(MoveBattleStyleDetail.to_json())

# convert the object into a dict
move_battle_style_detail_dict = move_battle_style_detail_instance.to_dict()
# create an instance of MoveBattleStyleDetail from a dict
move_battle_style_detail_from_dict = MoveBattleStyleDetail.from_dict(move_battle_style_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


