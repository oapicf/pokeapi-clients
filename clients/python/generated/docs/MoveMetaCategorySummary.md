# MoveMetaCategorySummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.move_meta_category_summary import MoveMetaCategorySummary

# TODO update the JSON string below
json = "{}"
# create an instance of MoveMetaCategorySummary from a JSON string
move_meta_category_summary_instance = MoveMetaCategorySummary.from_json(json)
# print the JSON string representation of the object
print(MoveMetaCategorySummary.to_json())

# convert the object into a dict
move_meta_category_summary_dict = move_meta_category_summary_instance.to_dict()
# create an instance of MoveMetaCategorySummary from a dict
move_meta_category_summary_from_dict = MoveMetaCategorySummary.from_dict(move_meta_category_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


