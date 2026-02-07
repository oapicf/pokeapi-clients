# TypeDetail

Serializer for the Type resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**damage_relations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | 
**past_damage_relations** | [**List[TypeDetailPastDamageRelationsInner]**](TypeDetailPastDamageRelationsInner.md) |  | 
**game_indices** | [**List[TypeGameIndex]**](TypeGameIndex.md) |  | 
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**names** | [**List[AbilityName]**](AbilityName.md) |  | 
**pokemon** | [**List[TypeDetailPokemonInner]**](TypeDetailPokemonInner.md) |  | 
**moves** | [**List[MoveSummary]**](MoveSummary.md) |  | 
**sprites** | **Dict[str, Dict[str, TypeDetailSpritesValueValue]]** |  | [readonly] 

## Example

```python
from pokeapiclient.models.type_detail import TypeDetail

# TODO update the JSON string below
json = "{}"
# create an instance of TypeDetail from a JSON string
type_detail_instance = TypeDetail.from_json(json)
# print the JSON string representation of the object
print(TypeDetail.to_json())

# convert the object into a dict
type_detail_dict = type_detail_instance.to_dict()
# create an instance of TypeDetail from a dict
type_detail_from_dict = TypeDetail.from_dict(type_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


