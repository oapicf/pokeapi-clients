# VersionGroupSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.version_group_summary import VersionGroupSummary

# TODO update the JSON string below
json = "{}"
# create an instance of VersionGroupSummary from a JSON string
version_group_summary_instance = VersionGroupSummary.from_json(json)
# print the JSON string representation of the object
print(VersionGroupSummary.to_json())

# convert the object into a dict
version_group_summary_dict = version_group_summary_instance.to_dict()
# create an instance of VersionGroupSummary from a dict
version_group_summary_from_dict = VersionGroupSummary.from_dict(version_group_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


