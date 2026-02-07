# EncounterMethodSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.encounter_method_summary import EncounterMethodSummary

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterMethodSummary from a JSON string
encounter_method_summary_instance = EncounterMethodSummary.from_json(json)
# print the JSON string representation of the object
print(EncounterMethodSummary.to_json())

# convert the object into a dict
encounter_method_summary_dict = encounter_method_summary_instance.to_dict()
# create an instance of EncounterMethodSummary from a dict
encounter_method_summary_from_dict = EncounterMethodSummary.from_dict(encounter_method_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


