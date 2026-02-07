# EncounterConditionValueName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.encounter_condition_value_name import EncounterConditionValueName

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterConditionValueName from a JSON string
encounter_condition_value_name_instance = EncounterConditionValueName.from_json(json)
# print the JSON string representation of the object
print(EncounterConditionValueName.to_json())

# convert the object into a dict
encounter_condition_value_name_dict = encounter_condition_value_name_instance.to_dict()
# create an instance of EncounterConditionValueName from a dict
encounter_condition_value_name_from_dict = EncounterConditionValueName.from_dict(encounter_condition_value_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


