# StatAffectingMoves


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**increase** | [**List[MoveStatChange]**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 
**decrease** | [**List[MoveStatChange]**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 

## Example

```python
from openapi_client.models.stat_affecting_moves import StatAffectingMoves

# TODO update the JSON string below
json = "{}"
# create an instance of StatAffectingMoves from a JSON string
stat_affecting_moves_instance = StatAffectingMoves.from_json(json)
# print the JSON string representation of the object
print StatAffectingMoves.to_json()

# convert the object into a dict
stat_affecting_moves_dict = stat_affecting_moves_instance.to_dict()
# create an instance of StatAffectingMoves from a dict
stat_affecting_moves_from_dict = StatAffectingMoves.from_dict(stat_affecting_moves_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


