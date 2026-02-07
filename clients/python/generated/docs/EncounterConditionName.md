# EncounterConditionName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.encounter_condition_name import EncounterConditionName

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterConditionName from a JSON string
encounter_condition_name_instance = EncounterConditionName.from_json(json)
# print the JSON string representation of the object
print(EncounterConditionName.to_json())

# convert the object into a dict
encounter_condition_name_dict = encounter_condition_name_instance.to_dict()
# create an instance of EncounterConditionName from a dict
encounter_condition_name_from_dict = EncounterConditionName.from_dict(encounter_condition_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


