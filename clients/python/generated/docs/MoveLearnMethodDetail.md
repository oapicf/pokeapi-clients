# MoveLearnMethodDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**names** | [**List[MoveLearnMethodName]**](MoveLearnMethodName.md) |  | 
**descriptions** | [**List[MoveLearnMethodDescription]**](MoveLearnMethodDescription.md) |  | 
**version_groups** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.move_learn_method_detail import MoveLearnMethodDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveLearnMethodDetail from a JSON string
move_learn_method_detail_instance = MoveLearnMethodDetail.from_json(json)
# print the JSON string representation of the object
print(MoveLearnMethodDetail.to_json())

# convert the object into a dict
move_learn_method_detail_dict = move_learn_method_detail_instance.to_dict()
# create an instance of MoveLearnMethodDetail from a dict
move_learn_method_detail_from_dict = MoveLearnMethodDetail.from_dict(move_learn_method_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


