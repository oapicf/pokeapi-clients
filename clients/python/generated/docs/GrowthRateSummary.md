# GrowthRateSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.growth_rate_summary import GrowthRateSummary

# TODO update the JSON string below
json = "{}"
# create an instance of GrowthRateSummary from a JSON string
growth_rate_summary_instance = GrowthRateSummary.from_json(json)
# print the JSON string representation of the object
print(GrowthRateSummary.to_json())

# convert the object into a dict
growth_rate_summary_dict = growth_rate_summary_instance.to_dict()
# create an instance of GrowthRateSummary from a dict
growth_rate_summary_from_dict = GrowthRateSummary.from_dict(growth_rate_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


