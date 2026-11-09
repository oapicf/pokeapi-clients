# EncounterConditionValueDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) | The condition this encounter condition value pertains to. | 
**names** | [**List[EncounterConditionValueName]**](EncounterConditionValueName.md) | The name of this resource listed in different languages. | [readonly] 

## Example

```python
from openapi_client.models.encounter_condition_value_detail import EncounterConditionValueDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterConditionValueDetail from a JSON string
encounter_condition_value_detail_instance = EncounterConditionValueDetail.from_json(json)
# print the JSON string representation of the object
print EncounterConditionValueDetail.to_json()

# convert the object into a dict
encounter_condition_value_detail_dict = encounter_condition_value_detail_instance.to_dict()
# create an instance of EncounterConditionValueDetail from a dict
encounter_condition_value_detail_from_dict = EncounterConditionValueDetail.from_dict(encounter_condition_value_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


