# MoveDamageClassDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.move_damage_class_description import MoveDamageClassDescription

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDamageClassDescription from a JSON string
move_damage_class_description_instance = MoveDamageClassDescription.from_json(json)
# print the JSON string representation of the object
print(MoveDamageClassDescription.to_json())

# convert the object into a dict
move_damage_class_description_dict = move_damage_class_description_instance.to_dict()
# create an instance of MoveDamageClassDescription from a dict
move_damage_class_description_from_dict = MoveDamageClassDescription.from_dict(move_damage_class_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


