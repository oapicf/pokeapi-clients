# MoveDamageClassDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**descriptions** | [**List[MoveDamageClassDescription]**](MoveDamageClassDescription.md) |  | 
**moves** | [**List[MoveSummary]**](MoveSummary.md) |  | 
**names** | [**List[MoveDamageClassName]**](MoveDamageClassName.md) |  | 

## Example

```python
from pokeapiclient.models.move_damage_class_detail import MoveDamageClassDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDamageClassDetail from a JSON string
move_damage_class_detail_instance = MoveDamageClassDetail.from_json(json)
# print the JSON string representation of the object
print(MoveDamageClassDetail.to_json())

# convert the object into a dict
move_damage_class_detail_dict = move_damage_class_detail_instance.to_dict()
# create an instance of MoveDamageClassDetail from a dict
move_damage_class_detail_from_dict = MoveDamageClassDetail.from_dict(move_damage_class_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


