# MoveTargetDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**descriptions** | [**List[MoveTargetDescription]**](MoveTargetDescription.md) |  | 
**moves** | [**List[MoveSummary]**](MoveSummary.md) |  | 
**names** | [**List[MoveTargetName]**](MoveTargetName.md) |  | 

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


