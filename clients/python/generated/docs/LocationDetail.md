# LocationDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**region** | [**RegionSummary**](RegionSummary.md) |  | 
**names** | [**List[LocationName]**](LocationName.md) |  | 
**game_indices** | [**List[LocationGameIndex]**](LocationGameIndex.md) |  | 
**areas** | [**List[LocationAreaSummary]**](LocationAreaSummary.md) |  | 

## Example

```python
from pokeapiclient.models.location_detail import LocationDetail

# TODO update the JSON string below
json = "{}"
# create an instance of LocationDetail from a JSON string
location_detail_instance = LocationDetail.from_json(json)
# print the JSON string representation of the object
print(LocationDetail.to_json())

# convert the object into a dict
location_detail_dict = location_detail_instance.to_dict()
# create an instance of LocationDetail from a dict
location_detail_from_dict = LocationDetail.from_dict(location_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


