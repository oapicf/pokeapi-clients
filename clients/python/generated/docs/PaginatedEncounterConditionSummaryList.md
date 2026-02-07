# PaginatedEncounterConditionSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[EncounterConditionSummary]**](EncounterConditionSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_encounter_condition_summary_list import PaginatedEncounterConditionSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedEncounterConditionSummaryList from a JSON string
paginated_encounter_condition_summary_list_instance = PaginatedEncounterConditionSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedEncounterConditionSummaryList.to_json())

# convert the object into a dict
paginated_encounter_condition_summary_list_dict = paginated_encounter_condition_summary_list_instance.to_dict()
# create an instance of PaginatedEncounterConditionSummaryList from a dict
paginated_encounter_condition_summary_list_from_dict = PaginatedEncounterConditionSummaryList.from_dict(paginated_encounter_condition_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


