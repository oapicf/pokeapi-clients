# MachineDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**item** | [**ItemSummary**](ItemSummary.md) |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**move** | [**MoveSummary**](MoveSummary.md) |  | 

## Example

```python
from pokeapiclient.models.machine_detail import MachineDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MachineDetail from a JSON string
machine_detail_instance = MachineDetail.from_json(json)
# print the JSON string representation of the object
print(MachineDetail.to_json())

# convert the object into a dict
machine_detail_dict = machine_detail_instance.to_dict()
# create an instance of MachineDetail from a dict
machine_detail_from_dict = MachineDetail.from_dict(machine_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


