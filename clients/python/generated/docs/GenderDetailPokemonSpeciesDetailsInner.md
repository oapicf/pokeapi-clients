# GenderDetailPokemonSpeciesDetailsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **int** |  | 
**pokemon_species** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.gender_detail_pokemon_species_details_inner import GenderDetailPokemonSpeciesDetailsInner

# TODO update the JSON string below
json = "{}"
# create an instance of GenderDetailPokemonSpeciesDetailsInner from a JSON string
gender_detail_pokemon_species_details_inner_instance = GenderDetailPokemonSpeciesDetailsInner.from_json(json)
# print the JSON string representation of the object
print(GenderDetailPokemonSpeciesDetailsInner.to_json())

# convert the object into a dict
gender_detail_pokemon_species_details_inner_dict = gender_detail_pokemon_species_details_inner_instance.to_dict()
# create an instance of GenderDetailPokemonSpeciesDetailsInner from a dict
gender_detail_pokemon_species_details_inner_from_dict = GenderDetailPokemonSpeciesDetailsInner.from_dict(gender_detail_pokemon_species_details_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


