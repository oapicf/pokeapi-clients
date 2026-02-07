# LocationGameIndex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_index** | **int** |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 

## Example

```python
from pokeapiclient.models.location_game_index import LocationGameIndex

# TODO update the JSON string below
json = "{}"
# create an instance of LocationGameIndex from a JSON string
location_game_index_instance = LocationGameIndex.from_json(json)
# print the JSON string representation of the object
print(LocationGameIndex.to_json())

# convert the object into a dict
location_game_index_dict = location_game_index_instance.to_dict()
# create an instance of LocationGameIndex from a dict
location_game_index_from_dict = LocationGameIndex.from_dict(location_game_index_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


