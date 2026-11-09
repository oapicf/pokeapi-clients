# MoveMetaCategoryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**descriptions** | [**List[MoveMetaCategoryDescription]**](MoveMetaCategoryDescription.md) | The description of this resource listed in different languages. | [readonly] 
**moves** | [**List[MoveSummary]**](MoveSummary.md) | A list of moves that fall into this category. | [readonly] 

## Example

```python
from pokeapiclient.models.move_meta_category_detail import MoveMetaCategoryDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveMetaCategoryDetail from a JSON string
move_meta_category_detail_instance = MoveMetaCategoryDetail.from_json(json)
# print the JSON string representation of the object
print(MoveMetaCategoryDetail.to_json())

# convert the object into a dict
move_meta_category_detail_dict = move_meta_category_detail_instance.to_dict()
# create an instance of MoveMetaCategoryDetail from a dict
move_meta_category_detail_from_dict = MoveMetaCategoryDetail.from_dict(move_meta_category_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


