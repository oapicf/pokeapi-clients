# LocationSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.location_summary import LocationSummary

# TODO update the JSON string below
json = "{}"
# create an instance of LocationSummary from a JSON string
location_summary_instance = LocationSummary.from_json(json)
# print the JSON string representation of the object
print(LocationSummary.to_json())

# convert the object into a dict
location_summary_dict = location_summary_instance.to_dict()
# create an instance of LocationSummary from a dict
location_summary_from_dict = LocationSummary.from_dict(location_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


