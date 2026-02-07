# StatDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**game_index** | **int** |  | 
**is_battle_only** | **bool** |  | [optional] 
**affecting_moves** | [**StatDetailAffectingMoves**](StatDetailAffectingMoves.md) |  | 
**affecting_natures** | [**StatDetailAffectingNatures**](StatDetailAffectingNatures.md) |  | 
**characteristics** | [**List[CharacteristicSummary]**](CharacteristicSummary.md) |  | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**List[StatName]**](StatName.md) |  | 

## Example

```python
from pokeapiclient.models.stat_detail import StatDetail

# TODO update the JSON string below
json = "{}"
# create an instance of StatDetail from a JSON string
stat_detail_instance = StatDetail.from_json(json)
# print the JSON string representation of the object
print(StatDetail.to_json())

# convert the object into a dict
stat_detail_dict = stat_detail_instance.to_dict()
# create an instance of StatDetail from a dict
stat_detail_from_dict = StatDetail.from_dict(stat_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


