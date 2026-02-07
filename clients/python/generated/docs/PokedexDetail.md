# PokedexDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [readonly] 
**name** | **str** |  | 
**is_main_series** | **bool** |  | [optional] 
**descriptions** | [**List[PokedexDescription]**](PokedexDescription.md) |  | 
**names** | [**List[PokedexName]**](PokedexName.md) |  | 
**pokemon_entries** | [**List[PokedexDetailPokemonEntriesInner]**](PokedexDetailPokemonEntriesInner.md) |  | 
**region** | [**RegionSummary**](RegionSummary.md) |  | 
**version_groups** | [**List[AbilityDetailPokemonInnerPokemon]**](AbilityDetailPokemonInnerPokemon.md) |  | 

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


