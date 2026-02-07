# BerryFlavorSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.berry_flavor_summary import BerryFlavorSummary

# TODO update the JSON string below
json = "{}"
# create an instance of BerryFlavorSummary from a JSON string
berry_flavor_summary_instance = BerryFlavorSummary.from_json(json)
# print the JSON string representation of the object
print(BerryFlavorSummary.to_json())

# convert the object into a dict
berry_flavor_summary_dict = berry_flavor_summary_instance.to_dict()
# create an instance of BerryFlavorSummary from a dict
berry_flavor_summary_from_dict = BerryFlavorSummary.from_dict(berry_flavor_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


