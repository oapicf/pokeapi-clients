# StatDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**game_index** | **int** | ID the games use for this stat. | 
**is_battle_only** | **bool** | Whether this stat only exists within a battle. | [optional] 
**affecting_moves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affecting_natures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affecting_items** | [**List[ItemSummary]**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [**List[CharacteristicSummary]**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [**List[StatName]**](StatName.md) | The name of this resource listed in different languages. | [readonly] 

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


