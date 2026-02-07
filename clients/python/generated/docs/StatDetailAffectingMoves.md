# StatDetailAffectingMoves


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**increase** | [**List[StatDetailAffectingMovesIncreaseInner]**](StatDetailAffectingMovesIncreaseInner.md) |  | 
**decrease** | [**List[StatDetailAffectingMovesIncreaseInner]**](StatDetailAffectingMovesIncreaseInner.md) |  | 

## Example

```python
from pokeapiclient.models.stat_detail_affecting_moves import StatDetailAffectingMoves

# TODO update the JSON string below
json = "{}"
# create an instance of StatDetailAffectingMoves from a JSON string
stat_detail_affecting_moves_instance = StatDetailAffectingMoves.from_json(json)
# print the JSON string representation of the object
print(StatDetailAffectingMoves.to_json())

# convert the object into a dict
stat_detail_affecting_moves_dict = stat_detail_affecting_moves_instance.to_dict()
# create an instance of StatDetailAffectingMoves from a dict
stat_detail_affecting_moves_from_dict = StatDetailAffectingMoves.from_dict(stat_detail_affecting_moves_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


