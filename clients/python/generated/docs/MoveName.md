# MoveName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_name import MoveName

# TODO update the JSON string below
json = "{}"
# create an instance of MoveName from a JSON string
move_name_instance = MoveName.from_json(json)
# print the JSON string representation of the object
print(MoveName.to_json())

# convert the object into a dict
move_name_dict = move_name_instance.to_dict()
# create an instance of MoveName from a dict
move_name_from_dict = MoveName.from_dict(move_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


