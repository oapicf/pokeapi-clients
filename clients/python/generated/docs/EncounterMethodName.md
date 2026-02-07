# EncounterMethodName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.encounter_method_name import EncounterMethodName

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterMethodName from a JSON string
encounter_method_name_instance = EncounterMethodName.from_json(json)
# print the JSON string representation of the object
print(EncounterMethodName.to_json())

# convert the object into a dict
encounter_method_name_dict = encounter_method_name_instance.to_dict()
# create an instance of EncounterMethodName from a dict
encounter_method_name_from_dict = EncounterMethodName.from_dict(encounter_method_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


