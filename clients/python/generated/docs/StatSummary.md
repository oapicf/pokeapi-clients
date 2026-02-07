# StatSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.stat_summary import StatSummary

# TODO update the JSON string below
json = "{}"
# create an instance of StatSummary from a JSON string
stat_summary_instance = StatSummary.from_json(json)
# print the JSON string representation of the object
print(StatSummary.to_json())

# convert the object into a dict
stat_summary_dict = stat_summary_instance.to_dict()
# create an instance of StatSummary from a dict
stat_summary_from_dict = StatSummary.from_dict(stat_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


