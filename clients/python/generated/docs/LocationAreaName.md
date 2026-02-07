# LocationAreaName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.location_area_name import LocationAreaName

# TODO update the JSON string below
json = "{}"
# create an instance of LocationAreaName from a JSON string
location_area_name_instance = LocationAreaName.from_json(json)
# print the JSON string representation of the object
print(LocationAreaName.to_json())

# convert the object into a dict
location_area_name_dict = location_area_name_instance.to_dict()
# create an instance of LocationAreaName from a dict
location_area_name_from_dict = LocationAreaName.from_dict(location_area_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


