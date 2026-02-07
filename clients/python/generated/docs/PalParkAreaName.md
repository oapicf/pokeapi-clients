# PalParkAreaName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.pal_park_area_name import PalParkAreaName

# TODO update the JSON string below
json = "{}"
# create an instance of PalParkAreaName from a JSON string
pal_park_area_name_instance = PalParkAreaName.from_json(json)
# print the JSON string representation of the object
print(PalParkAreaName.to_json())

# convert the object into a dict
pal_park_area_name_dict = pal_park_area_name_instance.to_dict()
# create an instance of PalParkAreaName from a dict
pal_park_area_name_from_dict = PalParkAreaName.from_dict(pal_park_area_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


