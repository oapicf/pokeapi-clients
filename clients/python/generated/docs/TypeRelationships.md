# TypeRelationships


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**no_damage_to** | [**List[TypeSummary]**](TypeSummary.md) | A list of types this type has no effect on. | 
**half_damage_to** | [**List[TypeSummary]**](TypeSummary.md) | A list of types this type is not very effect against. | 
**double_damage_to** | [**List[TypeSummary]**](TypeSummary.md) | A list of types this type is very effect against. | 
**no_damage_from** | [**List[TypeSummary]**](TypeSummary.md) | A list of types that have no effect on this type. | 
**half_damage_from** | [**List[TypeSummary]**](TypeSummary.md) | A list of types that are not very effective against this type. | 
**double_damage_from** | [**List[TypeSummary]**](TypeSummary.md) | A list of types that are very effective against this type. | 

## Example

```python
from pokeapiclient.models.type_relationships import TypeRelationships

# TODO update the JSON string below
json = "{}"
# create an instance of TypeRelationships from a JSON string
type_relationships_instance = TypeRelationships.from_json(json)
# print the JSON string representation of the object
print(TypeRelationships.to_json())

# convert the object into a dict
type_relationships_dict = type_relationships_instance.to_dict()
# create an instance of TypeRelationships from a dict
type_relationships_from_dict = TypeRelationships.from_dict(type_relationships_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


