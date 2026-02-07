# EncounterConditionSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.encounter_condition_summary import EncounterConditionSummary

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterConditionSummary from a JSON string
encounter_condition_summary_instance = EncounterConditionSummary.from_json(json)
# print the JSON string representation of the object
print(EncounterConditionSummary.to_json())

# convert the object into a dict
encounter_condition_summary_dict = encounter_condition_summary_instance.to_dict()
# create an instance of EncounterConditionSummary from a dict
encounter_condition_summary_from_dict = EncounterConditionSummary.from_dict(encounter_condition_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


