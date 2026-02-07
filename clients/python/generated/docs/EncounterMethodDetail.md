# EncounterMethodDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**order** | **int** |  | [optional] 
**names** | [**List[EncounterMethodName]**](EncounterMethodName.md) |  | 

## Example

```python
from pokeapiclient.models.encounter_method_detail import EncounterMethodDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EncounterMethodDetail from a JSON string
encounter_method_detail_instance = EncounterMethodDetail.from_json(json)
# print the JSON string representation of the object
print(EncounterMethodDetail.to_json())

# convert the object into a dict
encounter_method_detail_dict = encounter_method_detail_instance.to_dict()
# create an instance of EncounterMethodDetail from a dict
encounter_method_detail_from_dict = EncounterMethodDetail.from_dict(encounter_method_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


