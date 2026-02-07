# MoveMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) |  | 
**category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) |  | 
**min_hits** | **int** |  | [optional] 
**max_hits** | **int** |  | [optional] 
**min_turns** | **int** |  | [optional] 
**max_turns** | **int** |  | [optional] 
**drain** | **int** |  | [optional] 
**healing** | **int** |  | [optional] 
**crit_rate** | **int** |  | [optional] 
**ailment_chance** | **int** |  | [optional] 
**flinch_chance** | **int** |  | [optional] 
**stat_chance** | **int** |  | [optional] 

## Example

```python
from pokeapiclient.models.move_meta import MoveMeta

# TODO update the JSON string below
json = "{}"
# create an instance of MoveMeta from a JSON string
move_meta_instance = MoveMeta.from_json(json)
# print the JSON string representation of the object
print(MoveMeta.to_json())

# convert the object into a dict
move_meta_dict = move_meta_instance.to_dict()
# create an instance of MoveMeta from a dict
move_meta_from_dict = MoveMeta.from_dict(move_meta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


