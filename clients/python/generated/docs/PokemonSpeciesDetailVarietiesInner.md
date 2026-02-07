# PokemonSpeciesDetailVarietiesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_default** | **bool** |  | 
**pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Example

```python
from pokeapiclient.models.pokemon_species_detail_varieties_inner import PokemonSpeciesDetailVarietiesInner

# TODO update the JSON string below
json = "{}"
# create an instance of PokemonSpeciesDetailVarietiesInner from a JSON string
pokemon_species_detail_varieties_inner_instance = PokemonSpeciesDetailVarietiesInner.from_json(json)
# print the JSON string representation of the object
print(PokemonSpeciesDetailVarietiesInner.to_json())

# convert the object into a dict
pokemon_species_detail_varieties_inner_dict = pokemon_species_detail_varieties_inner_instance.to_dict()
# create an instance of PokemonSpeciesDetailVarietiesInner from a dict
pokemon_species_detail_varieties_inner_from_dict = PokemonSpeciesDetailVarietiesInner.from_dict(pokemon_species_detail_varieties_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


