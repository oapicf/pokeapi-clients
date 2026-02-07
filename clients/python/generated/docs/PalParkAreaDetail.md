# PalParkAreaDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**names** | [**List[PalParkAreaName]**](PalParkAreaName.md) |  | 
**pokemon_encounters** | [**List[PalParkAreaDetailPokemonEncountersInner]**](PalParkAreaDetailPokemonEncountersInner.md) |  | 

## Example

```python
from pokeapiclient.models.pal_park_area_detail import PalParkAreaDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PalParkAreaDetail from a JSON string
pal_park_area_detail_instance = PalParkAreaDetail.from_json(json)
# print the JSON string representation of the object
print(PalParkAreaDetail.to_json())

# convert the object into a dict
pal_park_area_detail_dict = pal_park_area_detail_instance.to_dict()
# create an instance of PalParkAreaDetail from a dict
pal_park_area_detail_from_dict = PalParkAreaDetail.from_dict(pal_park_area_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


