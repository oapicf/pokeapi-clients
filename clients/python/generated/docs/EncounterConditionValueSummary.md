# EncounterConditionValueSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.encounter_condition_value_summary import EncounterConditionValueSummary

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterConditionValueSummary from a JSON string
encounter_condition_value_summary_instance = EncounterConditionValueSummary.from_json(json)
# print the JSON string representation of the object
print(EncounterConditionValueSummary.to_json())

# convert the object into a dict
encounter_condition_value_summary_dict = encounter_condition_value_summary_instance.to_dict()
# create an instance of EncounterConditionValueSummary from a dict
encounter_condition_value_summary_from_dict = EncounterConditionValueSummary.from_dict(encounter_condition_value_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


