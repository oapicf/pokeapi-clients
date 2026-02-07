# MachineSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.machine_summary import MachineSummary

# TODO update the JSON string below
json = "{}"
# create an instance of MachineSummary from a JSON string
machine_summary_instance = MachineSummary.from_json(json)
# print the JSON string representation of the object
print(MachineSummary.to_json())

# convert the object into a dict
machine_summary_dict = machine_summary_instance.to_dict()
# create an instance of MachineSummary from a dict
machine_summary_from_dict = MachineSummary.from_dict(machine_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


