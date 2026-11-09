# MachineDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**item** | [**ItemSummary**](ItemSummary.md) | The TM or HM item that corresponds to this machine. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that this machine applies to. | 
**move** | [**MoveSummary**](MoveSummary.md) | The move that is taught by this machine. | 

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


