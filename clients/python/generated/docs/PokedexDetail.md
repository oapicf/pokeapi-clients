# PokedexDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **str** | The name for this resource. | 
**is_main_series** | **bool** | Whether or not this Pokédex originated in the main series of the video games. | [optional] 
**descriptions** | [**List[PokedexDescription]**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] 
**names** | [**List[PokedexName]**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_entries** | [**List[PokemonDexNumber]**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] 
**region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | 
**version_groups** | [**List[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] 

## Example

```python
from pokeapiclient.models.pokedex_detail import PokedexDetail

# TODO update the JSON string below
json = "{}"
# create an instance of PokedexDetail from a JSON string
pokedex_detail_instance = PokedexDetail.from_json(json)
# print the JSON string representation of the object
print(PokedexDetail.to_json())

# convert the object into a dict
pokedex_detail_dict = pokedex_detail_instance.to_dict()
# create an instance of PokedexDetail from a dict
pokedex_detail_from_dict = PokedexDetail.from_dict(pokedex_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


