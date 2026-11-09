# TypeDetail

Serializer for the Type resource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**damage_relations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**past_damage_relations** | [**List[TypePastRelationships]**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**game_indices** | [**List[TypeGameIndex]**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**names** | [**List[TypeName]**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon** | [**List[TypePokemon]**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**moves** | [**List[MoveSummary]**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**sprites** | **Dict[str, Dict[str, TypeGameSprite]]** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

## Example

```python
from openapi_client.models.type_detail import TypeDetail

# TODO update the JSON string below
json = "{}"
# create an instance of TypeDetail from a JSON string
type_detail_instance = TypeDetail.from_json(json)
# print the JSON string representation of the object
print TypeDetail.to_json()

# convert the object into a dict
type_detail_dict = type_detail_instance.to_dict()
# create an instance of TypeDetail from a dict
type_detail_from_dict = TypeDetail.from_dict(type_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


