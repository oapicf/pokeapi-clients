# PalParkAreaDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**names** | [**List[PalParkAreaName]**](PalParkAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_encounters** | [**List[PalParkEncounter]**](PalParkEncounter.md) | A list of Pokémon encountered in thi pal park area along with details. | [readonly] 

## Example

```python
from openapi_client.models.pal_park_area_detail import PalParkAreaDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PalParkAreaDetail from a JSON string
pal_park_area_detail_instance = PalParkAreaDetail.from_json(json)
# print the JSON string representation of the object
print PalParkAreaDetail.to_json()

# convert the object into a dict
pal_park_area_detail_dict = pal_park_area_detail_instance.to_dict()
# create an instance of PalParkAreaDetail from a dict
pal_park_area_detail_from_dict = PalParkAreaDetail.from_dict(pal_park_area_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


