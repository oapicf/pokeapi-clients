# ItemGameIndex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**game_index** | **int** | The internal id of an API resource within game data. | 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation relevent to this game index. | 

## Example

```python
from pokeapiclient.models.item_game_index import ItemGameIndex

# TODO update the JSON string below
json = "{}"
# create an instance of ItemGameIndex from a JSON string
item_game_index_instance = ItemGameIndex.from_json(json)
# print the JSON string representation of the object
print(ItemGameIndex.to_json())

# convert the object into a dict
item_game_index_dict = item_game_index_instance.to_dict()
# create an instance of ItemGameIndex from a dict
item_game_index_from_dict = ItemGameIndex.from_dict(item_game_index_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


