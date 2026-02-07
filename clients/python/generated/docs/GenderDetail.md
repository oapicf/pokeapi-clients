# GenderDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**pokemon_species_details** | [**List[GenderDetailPokemonSpeciesDetailsInner]**](GenderDetailPokemonSpeciesDetailsInner.md) |  | 
**required_for_evolution** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

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


