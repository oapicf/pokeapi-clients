# MoveMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**min_hits** | **int** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**max_hits** | **int** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**min_turns** | **int** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**max_turns** | **int** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**drain** | **int** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] 
**healing** | **int** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] 
**crit_rate** | **int** | Critical hit rate bonus. | [optional] 
**ailment_chance** | **int** | The likelihood this attack will cause an ailment. | [optional] 
**flinch_chance** | **int** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] 
**stat_chance** | **int** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] 

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


