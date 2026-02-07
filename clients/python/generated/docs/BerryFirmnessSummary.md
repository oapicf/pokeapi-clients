# BerryFirmnessSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.berry_firmness_summary import BerryFirmnessSummary

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFirmnessSummary from a JSON string
berry_firmness_summary_instance = BerryFirmnessSummary.from_json(json)
# print the JSON string representation of the object
print(BerryFirmnessSummary.to_json())

# convert the object into a dict
berry_firmness_summary_dict = berry_firmness_summary_instance.to_dict()
# create an instance of BerryFirmnessSummary from a dict
berry_firmness_summary_from_dict = BerryFirmnessSummary.from_dict(berry_firmness_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


