# MoveMetaAilmentDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**moves** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**names** | [**List[MoveMetaAilmentName]**](MoveMetaAilmentName.md) |  | 

## Example

```python
from pokeapiclient.models.move_meta_ailment_detail import MoveMetaAilmentDetail

# TODO update the JSON string below
json = "{}"
# create an instance of MoveMetaAilmentDetail from a JSON string
move_meta_ailment_detail_instance = MoveMetaAilmentDetail.from_json(json)
# print the JSON string representation of the object
print(MoveMetaAilmentDetail.to_json())

# convert the object into a dict
move_meta_ailment_detail_dict = move_meta_ailment_detail_instance.to_dict()
# create an instance of MoveMetaAilmentDetail from a dict
move_meta_ailment_detail_from_dict = MoveMetaAilmentDetail.from_dict(move_meta_ailment_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


