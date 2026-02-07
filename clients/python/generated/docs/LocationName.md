# LocationName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.location_name import LocationName

# TODO update the JSON string below
json = "{}"
# create an instance of LocationName from a JSON string
location_name_instance = LocationName.from_json(json)
# print the JSON string representation of the object
print(LocationName.to_json())

# convert the object into a dict
location_name_dict = location_name_instance.to_dict()
# create an instance of LocationName from a dict
location_name_from_dict = LocationName.from_dict(location_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


