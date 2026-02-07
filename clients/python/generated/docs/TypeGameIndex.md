# TypeGameIndex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_index** | **int** |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 

## Example

```python
from pokeapiclient.models.type_game_index import TypeGameIndex

# TODO update the JSON string below
json = "{}"
# create an instance of TypeGameIndex from a JSON string
type_game_index_instance = TypeGameIndex.from_json(json)
# print the JSON string representation of the object
print(TypeGameIndex.to_json())

# convert the object into a dict
type_game_index_dict = type_game_index_instance.to_dict()
# create an instance of TypeGameIndex from a dict
type_game_index_from_dict = TypeGameIndex.from_dict(type_game_index_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


