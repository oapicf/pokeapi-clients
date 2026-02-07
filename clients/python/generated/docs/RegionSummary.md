# RegionSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.region_summary import RegionSummary

# TODO update the JSON string below
json = "{}"
# create an instance of RegionSummary from a JSON string
region_summary_instance = RegionSummary.from_json(json)
# print the JSON string representation of the object
print(RegionSummary.to_json())

# convert the object into a dict
region_summary_dict = region_summary_instance.to_dict()
# create an instance of RegionSummary from a dict
region_summary_from_dict = RegionSummary.from_dict(region_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


