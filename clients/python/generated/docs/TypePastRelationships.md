# TypePastRelationships


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced type had the listed damage relations | 
**damage_relations** | [**TypeRelationships**](TypeRelationships.md) | The damage relations the referenced type had up to and including the listed generation | 

## Example

```python
from pokeapiclient.models.type_past_relationships import TypePastRelationships

# TODO update the JSON string below
json = "{}"
# create an instance of TypePastRelationships from a JSON string
type_past_relationships_instance = TypePastRelationships.from_json(json)
# print the JSON string representation of the object
print(TypePastRelationships.to_json())

# convert the object into a dict
type_past_relationships_dict = type_past_relationships_instance.to_dict()
# create an instance of TypePastRelationships from a dict
type_past_relationships_from_dict = TypePastRelationships.from_dict(type_past_relationships_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


