# GrowthRateDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.growth_rate_description import GrowthRateDescription

# TODO update the JSON string below
json = "{}"
# create an instance of GrowthRateDescription from a JSON string
growth_rate_description_instance = GrowthRateDescription.from_json(json)
# print the JSON string representation of the object
print(GrowthRateDescription.to_json())

# convert the object into a dict
growth_rate_description_dict = growth_rate_description_instance.to_dict()
# create an instance of GrowthRateDescription from a dict
growth_rate_description_from_dict = GrowthRateDescription.from_dict(growth_rate_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


