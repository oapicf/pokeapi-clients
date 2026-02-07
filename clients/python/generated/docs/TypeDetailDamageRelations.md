# TypeDetailDamageRelations


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**no_damage_to** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**half_damage_to** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**double_damage_to** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**no_damage_from** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**half_damage_from** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**double_damage_from** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.type_detail_damage_relations import TypeDetailDamageRelations

# TODO update the JSON string below
json = "{}"
# create an instance of TypeDetailDamageRelations from a JSON string
type_detail_damage_relations_instance = TypeDetailDamageRelations.from_json(json)
# print the JSON string representation of the object
print(TypeDetailDamageRelations.to_json())

# convert the object into a dict
type_detail_damage_relations_dict = type_detail_damage_relations_instance.to_dict()
# create an instance of TypeDetailDamageRelations from a dict
type_detail_damage_relations_from_dict = TypeDetailDamageRelations.from_dict(type_detail_damage_relations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


