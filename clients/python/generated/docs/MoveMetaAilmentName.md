# MoveMetaAilmentName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_meta_ailment_name import MoveMetaAilmentName

# TODO update the JSON string below
json = "{}"
# create an instance of MoveMetaAilmentName from a JSON string
move_meta_ailment_name_instance = MoveMetaAilmentName.from_json(json)
# print the JSON string representation of the object
print(MoveMetaAilmentName.to_json())

# convert the object into a dict
move_meta_ailment_name_dict = move_meta_ailment_name_instance.to_dict()
# create an instance of MoveMetaAilmentName from a dict
move_meta_ailment_name_from_dict = MoveMetaAilmentName.from_dict(move_meta_ailment_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


