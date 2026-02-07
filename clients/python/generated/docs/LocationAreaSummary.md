# LocationAreaSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.location_area_summary import LocationAreaSummary

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaSummary from a JSON string
location_area_summary_instance = LocationAreaSummary.from_json(json)
# print the JSON string representation of the object
print(LocationAreaSummary.to_json())

# convert the object into a dict
location_area_summary_dict = location_area_summary_instance.to_dict()
# create an instance of LocationAreaSummary from a dict
location_area_summary_from_dict = LocationAreaSummary.from_dict(location_area_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


