# MoveDamageClassName


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this name is in. | 

## Example

```python
from openapi_client.models.move_damage_class_name import MoveDamageClassName

# TODO update the JSON string below
json = "{}"
# create an instance of MoveDamageClassName from a JSON string
move_damage_class_name_instance = MoveDamageClassName.from_json(json)
# print the JSON string representation of the object
print MoveDamageClassName.to_json()

# convert the object into a dict
move_damage_class_name_dict = move_damage_class_name_instance.to_dict()
# create an instance of MoveDamageClassName from a dict
move_damage_class_name_from_dict = MoveDamageClassName.from_dict(move_damage_class_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


