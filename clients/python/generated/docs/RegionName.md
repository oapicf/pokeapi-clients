# RegionName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.region_name import RegionName

# TODO update the JSON string below
json = "{}"
# create an instance of RegionName from a JSON string
region_name_instance = RegionName.from_json(json)
# print the JSON string representation of the object
print(RegionName.to_json())

# convert the object into a dict
region_name_dict = region_name_instance.to_dict()
# create an instance of RegionName from a dict
region_name_from_dict = RegionName.from_dict(region_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


