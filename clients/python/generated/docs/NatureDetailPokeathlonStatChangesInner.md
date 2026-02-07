# NatureDetailPokeathlonStatChangesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_change** | **int** |  | 
**pokeathlon_stat** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.nature_detail_pokeathlon_stat_changes_inner import NatureDetailPokeathlonStatChangesInner

# TODO update the JSON string below
json = "{}"
# create an instance of NatureDetailPokeathlonStatChangesInner from a JSON string
nature_detail_pokeathlon_stat_changes_inner_instance = NatureDetailPokeathlonStatChangesInner.from_json(json)
# print the JSON string representation of the object
print(NatureDetailPokeathlonStatChangesInner.to_json())

# convert the object into a dict
nature_detail_pokeathlon_stat_changes_inner_dict = nature_detail_pokeathlon_stat_changes_inner_instance.to_dict()
# create an instance of NatureDetailPokeathlonStatChangesInner from a dict
nature_detail_pokeathlon_stat_changes_inner_from_dict = NatureDetailPokeathlonStatChangesInner.from_dict(nature_detail_pokeathlon_stat_changes_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


