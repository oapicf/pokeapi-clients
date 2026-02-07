# TypeDetailPastDamageRelationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**damage_relations** | [**TypeDetailPastDamageRelationsInnerDamageRelations**](TypeDetailPastDamageRelationsInnerDamageRelations.md) |  | 

## Example

```python
from pokeapiclient.models.type_detail_past_damage_relations_inner import TypeDetailPastDamageRelationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of TypeDetailPastDamageRelationsInner from a JSON string
type_detail_past_damage_relations_inner_instance = TypeDetailPastDamageRelationsInner.from_json(json)
# print the JSON string representation of the object
print(TypeDetailPastDamageRelationsInner.to_json())

# convert the object into a dict
type_detail_past_damage_relations_inner_dict = type_detail_past_damage_relations_inner_instance.to_dict()
# create an instance of TypeDetailPastDamageRelationsInner from a dict
type_detail_past_damage_relations_inner_from_dict = TypeDetailPastDamageRelationsInner.from_dict(type_detail_past_damage_relations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


