# LocationDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**region** | [**RegionSummary**](RegionSummary.md) | The region this location can be found in. | 
**names** | [**List[LocationName]**](LocationName.md) | The name of this resource listed in different languages. | [readonly] 
**game_indices** | [**List[LocationGameIndex]**](LocationGameIndex.md) | A list of game indices relevent to this location by generation. | [readonly] 
**areas** | [**List[LocationAreaSummary]**](LocationAreaSummary.md) | Areas that can be found within this location. | [readonly] 

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


