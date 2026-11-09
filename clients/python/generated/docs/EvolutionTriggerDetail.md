# EvolutionTriggerDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**names** | [**List[EvolutionTriggerName]**](EvolutionTriggerName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of pokemon species that result from this evolution trigger. | [readonly] 

## Example

```python
from pokeapiclient.models.evolution_trigger_detail import EvolutionTriggerDetail

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionTriggerDetail from a JSON string
evolution_trigger_detail_instance = EvolutionTriggerDetail.from_json(json)
# print the JSON string representation of the object
print(EvolutionTriggerDetail.to_json())

# convert the object into a dict
evolution_trigger_detail_dict = evolution_trigger_detail_instance.to_dict()
# create an instance of EvolutionTriggerDetail from a dict
evolution_trigger_detail_from_dict = EvolutionTriggerDetail.from_dict(evolution_trigger_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


