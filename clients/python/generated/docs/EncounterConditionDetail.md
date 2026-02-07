# EncounterConditionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**values** | [**List[EncounterConditionValueSummary]**](EncounterConditionValueSummary.md) |  | 
**names** | [**List[EncounterConditionName]**](EncounterConditionName.md) |  | 

## Example

```python
from pokeapiclient.models.encounter_condition_detail import EncounterConditionDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterConditionDetail from a JSON string
encounter_condition_detail_instance = EncounterConditionDetail.from_json(json)
# print the JSON string representation of the object
print(EncounterConditionDetail.to_json())

# convert the object into a dict
encounter_condition_detail_dict = encounter_condition_detail_instance.to_dict()
# create an instance of EncounterConditionDetail from a dict
encounter_condition_detail_from_dict = EncounterConditionDetail.from_dict(encounter_condition_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


