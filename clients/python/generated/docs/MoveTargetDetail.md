# MoveTargetDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**descriptions** | [**List[MoveTargetDescription]**](MoveTargetDescription.md) | The description of this resource listed in different languages. | [readonly] 
**moves** | [**List[MoveSummary]**](MoveSummary.md) | A list of moves that that are directed at this target. | [readonly] 
**names** | [**List[MoveTargetName]**](MoveTargetName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from pokeapiclient.models.move_target_detail import MoveTargetDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveTargetDetail from a JSON string
move_target_detail_instance = MoveTargetDetail.from_json(json)
# print the JSON string representation of the object
print(MoveTargetDetail.to_json())

# convert the object into a dict
move_target_detail_dict = move_target_detail_instance.to_dict()
# create an instance of MoveTargetDetail from a dict
move_target_detail_from_dict = MoveTargetDetail.from_dict(move_target_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


