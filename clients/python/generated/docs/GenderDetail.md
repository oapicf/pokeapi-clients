# GenderDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**pokemon_species_details** | [**List[GenderPokemonSpecies]**](GenderPokemonSpecies.md) | A list of Pokémon species that can be this gender and how likely it is that they will be. | [readonly] 
**required_for_evolution** | [**List[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. | [readonly] 

## Example

```python
from pokeapiclient.models.gender_detail import GenderDetail

# TODO update the JSON string below
json = "{}"
# create an instance of GenderDetail from a JSON string
gender_detail_instance = GenderDetail.from_json(json)
# print the JSON string representation of the object
print(GenderDetail.to_json())

# convert the object into a dict
gender_detail_dict = gender_detail_instance.to_dict()
# create an instance of GenderDetail from a dict
gender_detail_from_dict = GenderDetail.from_dict(gender_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


