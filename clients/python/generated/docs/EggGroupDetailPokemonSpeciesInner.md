# EggGroupDetailPokemonSpeciesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Pokemon species name. | [optional] 
**url** | **str** | The URL to get more information about the species | [optional] 

## Example

```python
from pokeapiclient.models.egg_group_detail_pokemon_species_inner import EggGroupDetailPokemonSpeciesInner

# TODO update the JSON string below
json = "{}"
# create an instance of EggGroupDetailPokemonSpeciesInner from a JSON string
egg_group_detail_pokemon_species_inner_instance = EggGroupDetailPokemonSpeciesInner.from_json(json)
# print the JSON string representation of the object
print(EggGroupDetailPokemonSpeciesInner.to_json())

# convert the object into a dict
egg_group_detail_pokemon_species_inner_dict = egg_group_detail_pokemon_species_inner_instance.to_dict()
# create an instance of EggGroupDetailPokemonSpeciesInner from a dict
egg_group_detail_pokemon_species_inner_from_dict = EggGroupDetailPokemonSpeciesInner.from_dict(egg_group_detail_pokemon_species_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


