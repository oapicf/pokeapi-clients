# PalParkAreaSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.pal_park_area_summary import PalParkAreaSummary

# TODO update the JSON string below
json = "{}"
# create an instance of PalParkAreaSummary from a JSON string
pal_park_area_summary_instance = PalParkAreaSummary.from_json(json)
# print the JSON string representation of the object
print(PalParkAreaSummary.to_json())

# convert the object into a dict
pal_park_area_summary_dict = pal_park_area_summary_instance.to_dict()
# create an instance of PalParkAreaSummary from a dict
pal_park_area_summary_from_dict = PalParkAreaSummary.from_dict(pal_park_area_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


