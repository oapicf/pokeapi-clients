# MoveMetaCategoryDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_meta_category_description import MoveMetaCategoryDescription

# TODO update the JSON string below
json = "{}"
# create an instance of MoveMetaCategoryDescription from a JSON string
move_meta_category_description_instance = MoveMetaCategoryDescription.from_json(json)
# print the JSON string representation of the object
print(MoveMetaCategoryDescription.to_json())

# convert the object into a dict
move_meta_category_description_dict = move_meta_category_description_instance.to_dict()
# create an instance of MoveMetaCategoryDescription from a dict
move_meta_category_description_from_dict = MoveMetaCategoryDescription.from_dict(move_meta_category_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


