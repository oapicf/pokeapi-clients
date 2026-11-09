# MoveDamageClassDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**descriptions** | [**List[MoveDamageClassDescription]**](MoveDamageClassDescription.md) | The description of this resource listed in different languages. | [readonly] 
**moves** | [**List[MoveSummary]**](MoveSummary.md) | A list of moves that fall into this damage class. | [readonly] 
**names** | [**List[MoveDamageClassName]**](MoveDamageClassName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from openapi_client.models.move_damage_class_detail import MoveDamageClassDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDamageClassDetail from a JSON string
move_damage_class_detail_instance = MoveDamageClassDetail.from_json(json)
# print the JSON string representation of the object
print MoveDamageClassDetail.to_json()

# convert the object into a dict
move_damage_class_detail_dict = move_damage_class_detail_instance.to_dict()
# create an instance of MoveDamageClassDetail from a dict
move_damage_class_detail_from_dict = MoveDamageClassDetail.from_dict(move_damage_class_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


