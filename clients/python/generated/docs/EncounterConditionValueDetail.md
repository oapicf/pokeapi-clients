# EncounterConditionValueDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) |  | 
**names** | [**List[EncounterConditionValueName]**](EncounterConditionValueName.md) |  | 

## Example

```python
from pokeapiclient.models.encounter_condition_value_detail import EncounterConditionValueDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterConditionValueDetail from a JSON string
encounter_condition_value_detail_instance = EncounterConditionValueDetail.from_json(json)
# print the JSON string representation of the object
print(EncounterConditionValueDetail.to_json())

# convert the object into a dict
encounter_condition_value_detail_dict = encounter_condition_value_detail_instance.to_dict()
# create an instance of EncounterConditionValueDetail from a dict
encounter_condition_value_detail_from_dict = EncounterConditionValueDetail.from_dict(encounter_condition_value_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


