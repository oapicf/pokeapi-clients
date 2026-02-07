# MoveFlavorText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_flavor_text import MoveFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of MoveFlavorText from a JSON string
move_flavor_text_instance = MoveFlavorText.from_json(json)
# print the JSON string representation of the object
print(MoveFlavorText.to_json())

# convert the object into a dict
move_flavor_text_dict = move_flavor_text_instance.to_dict()
# create an instance of MoveFlavorText from a dict
move_flavor_text_from_dict = MoveFlavorText.from_dict(move_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


